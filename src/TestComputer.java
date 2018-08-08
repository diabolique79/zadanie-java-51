import java.util.InputMismatchException;
import java.util.Scanner;

public class TestComputer {
 public static void main(String[] args) {


        Components procesor = new Processor("Intel i5", "Intel", "555ASDIntel", 2500);
        ((Processor) procesor).getProcesorClockSpeed();
        System.out.printf("Taktowanie procesora nazwa: %s, producer: %s, o numerze seryjnym %s, wynosi: %d MHz\n", procesor.getName(), procesor.getProducer(), procesor.getSerialNumber(), ((Processor) procesor).getProcesorClockSpeed());
        System.out.println(((Processor) procesor).getProcesorClockSpeed());


        boolean error = true;
        while (error){
        try{
            System.out.println("Wprowadź nowe taktowanie procesora: ");
            Scanner scanner = new Scanner(System.in);
            int newProcessorSpeed = scanner.nextInt();
            System.out.println("Temperatura procesora wynosi po wprowadzeniu zmian w taktowaniu: " + ((Processor) procesor).processorClockSpeedTemp(newProcessorSpeed));

            if (((Processor) procesor).processorClockSpeedTemp(newProcessorSpeed) >= ComponentsChange.PROCESSOR_TEMP_MAX){
                System.out.println("Dojdzie do przegrzania!!!");

                throw new MyExcaption2();
            }
            else if ((newProcessorSpeed <= ((Processor) procesor).getProcesorClockSpeed())){
                throw new MyException();
            }
            else System.out.println("Nie dojdzie do przegrzania :)");
            error = false;
        }catch (InputMismatchException e){

            System.out.println("Błędnie wprowadzone.");
        }catch (MyException b){

            System.out.println("Podane taktowanie powinno być wyższe.");
        }catch (MyExcaption2 c){
            System.out.println("Podane taktowanie jest stanowczo za duże, dojdzie do przegrzania procesora.");

        }
    }
}}
