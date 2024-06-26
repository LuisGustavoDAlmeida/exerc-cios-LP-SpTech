import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Não é utilizado mais o Date, está defasado
        // Utilizamos as classes do pacote Java.time

        // LocalDate - Trabalhando somente com a hora local, não de outro país;
        // ZonedDateTime - Trabalha com zonas;
        // OffsetDateTime - Trabalha com zonas;

        LocalDate data = LocalDate.now(); // De acordo com o horário da JVM
        LocalDateTime dataHora = LocalDateTime.now(); // Vai pegar a data, o horário até os microsegundos
        System.out.println(data);


        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm"); // ofPattern para
        // escolher um padrão

        System.out.println(formatador.format(dataHora)); // Escolhemos a data para formatar

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma data e hora");
        String dataTexto = leitor.nextLine();

        LocalDateTime dataDigitada = LocalDateTime.parse(dataTexto, formatador); // Converter de texto pra data

        System.out.println(dataDigitada.getDayOfWeek());

        System.out.println(dataDigitada.isAfter(dataHora));
    }
}
