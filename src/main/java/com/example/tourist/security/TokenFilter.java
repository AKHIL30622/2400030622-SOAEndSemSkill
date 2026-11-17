package com.example.tourist.security;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
@Component
public class TokenFilter extends OncePerRequestFilter {
 @Value("${app.auth.token}") private String validToken;
 @Override protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response,FilterChain chain) throws ServletException,IOException {
  if(!request.getRequestURI().equals("/api/tourists")){chain.doFilter(request,response);return;}
  String token=request.getHeader("Token");
  boolean valid=token!=null && MessageDigest.isEqual(token.getBytes(StandardCharsets.UTF_8),validToken.getBytes(StandardCharsets.UTF_8));
  if(!valid){response.setStatus(500);response.setContentType("text/plain");response.getWriter().write("Unauthorized: Invalid Token Provided");return;}
  chain.doFilter(request,response);
 }
}
