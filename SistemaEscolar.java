import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;

        System.out.println("--- Sistema Escolar de Médias ---");
        
        // Recebe as 8 notas anuais
        System.out.print("Digite a nota do 1º bimestre: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a nota do 2º bimestre: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a nota do 3º bimestre: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a nota do 4º bimestre: ");
        nota4 = scanner.nextDouble();
        System.out.print("Digite a nota do 5º bimestre: ");
        nota5 = scanner.nextDouble();
        System.out.print("Digite a nota do 6º bimestre: ");
        nota6 = scanner.nextDouble();
        System.out.print("Digite a nota do 7º bimestre: ");
        nota7 = scanner.nextDouble();
        System.out.print("Digite a nota do 8º bimestre: ");
        nota8 = scanner.nextDouble();

        // Calcula as médias bimestrais
        double mediaBimestre1 = (nota1 + nota2) / 2;
        double mediaBimestre2 = (nota3 + nota4) / 2;
        double mediaBimestre3 = (nota5 + nota6) / 2;
        double mediaBimestre4 = (nota7 + nota8) / 2;
        
        // Calcula as médias semestrais
        double mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2;
        
        // Calcula a média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Apresenta os resultados de forma clara
        System.out.println("\n--- Resultados ---");
        System.out.printf("1º Bimestre: %.2f\n", mediaBimestre1);
        System.out.printf("2º Bimestre: %.2f\n", mediaBimestre2);
        System.out.printf("1º Semestre: %.2f\n", mediaSemestre1);
        System.out.printf("3º Bimestre: %.2f\n", mediaBimestre3);
        System.out.printf("4º Bimestre: %.2f\n", mediaBimestre4);
        System.out.printf("2º Semestre: %.2f\n", mediaSemestre2);
        System.out.printf("Média Final: %.2f\n", mediaFinal);

        scanner.close();
    }
}