package com.buddycoach.usermanagerservice.config;

import com.buddycoach.usermanagerservice.utils.JwtProvider;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Aquí deberías configurar Spring Security, pero como no puedes usar anotaciones y otras funcionalidades de Spring,
// puedes hacer un filtro básico si estás usando algo como servlets.

public class SecurityConfig {

    private final JwtProvider jwtProvider;

    public SecurityConfig(JwtProvider jwtProvider) {
        this.jwtProvider = jwtProvider;
    }

    public void doFilter(HttpServletResponse response, String token) throws IOException {
        if (!jwtProvider.validateToken(token)) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid JWT token");
        }
        // ToDo lógica para establecer la autenticación.
    }
}
