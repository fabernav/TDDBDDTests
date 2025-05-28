import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TDDTests {

    AuthService authService = new AuthService();

    @Test
    public void testLoginValido() {
        assertTrue(authService.login("aluno@maua.br", "senha123"));
    }

    @Test
    public void testLoginSenhaIncorreta() {
        assertFalse(authService.login("aluno@maua.br", "senhaErrada"));
    }

    @Test
    public void testLoginEmailNulo() {
        assertFalse(authService.login(null, "senha123"));
    }

    @Test
    public void testLoginSenhaNula() {
        assertFalse(authService.login("aluno@maua.br", null));
    }

    @Test
    public void testLoginEmailVazio() {
        assertFalse(authService.login("", "senha123"));
    }

    @Test
    public void testLoginSenhaVazia() {
        assertFalse(authService.login("aluno@maua.br", ""));
    }

    @Test
    public void testLoginEmailFormatoInvalido() {
        assertFalse(authService.login("aluno@@maua", "senha123")); // Simulação simples
    }
}

class AuthService {
    public boolean login(String email, String senha) {
        if (email == null || senha == null || email.isEmpty() || senha.isEmpty()) return false;
        if (!email.contains("@")) return false;
        return email.equals("aluno@maua.br") && senha.equals("senha123");
    }
}
