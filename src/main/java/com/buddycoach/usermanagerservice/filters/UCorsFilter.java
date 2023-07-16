package com.buddycoach.usermanagerservice.filters;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.filter.CorsFilter;
import org.springframework.core.annotation.Order;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;

@Component
@Order(Integer.MIN_VALUE)
public class UCorsFilter extends OncePerRequestFilter {
// public class UCorsFilter extends CorsFilter {

    @Override
    protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
                                    final FilterChain filterChain) throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, HEAD, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Origin,Accept,X-Requested-With,Content-Type,content-type,Access-Control-Request-Method,Access-Control-Request-Headers");
        response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
        response.addHeader("Access-Control-Allow-Credentials", "true");
        response.addIntHeader("Access-Control-Max-Age", 3600);
        filterChain.doFilter(request, response);
    }
}
