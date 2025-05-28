public class CaixaBrancaTests {

    public String verificarLinha(String linha) {
        if (linha == null || linha.trim().isEmpty()) {
            return "Linha inválida";
        }
        if (linha.equalsIgnoreCase("Circular 1")) {
            return "Linha disponível";
        } else if (linha.equalsIgnoreCase("Circular 2")) {
            return "Linha disponível";
        } else {
            return "Linha não encontrada";
        }
    }

    public static void main(String[] args) {
        CaixaBrancaTests teste = new CaixaBrancaTests();
        System.out.println(teste.verificarLinha(null));              // Linha inválida
        System.out.println(teste.verificarLinha(""));                // Linha inválida
        System.out.println(teste.verificarLinha("Circular 1"));      // Linha disponível
        System.out.println(teste.verificarLinha("Circular 2"));      // Linha disponível
        System.out.println(teste.verificarLinha("Executiva X"));     // Linha não encontrada
    }
}
