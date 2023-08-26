import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorDivisasAlura {
    public static void main(String[] args) throws Exception {
        Object[] options = { "CONVERTIR DIVISAS", "CONVERTIR TEMPERATURA", "SALIR" };
        int elige = JOptionPane.showOptionDialog(null, "ELIGUE UNA OPCIÓN :", "ALURA CONVERSOR DE DIVISAS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "PROGRAMA CERRANDO");
            System.exit(0);
        }

        if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#0.00000");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {
                        "Convertir de peso Colombiano a Dolar",
                        "Convertir de peso Colombiano a Euro",
                        "Convertir de peso Colombiano a Libras Esterlinas",
                        "Convertir de peso Colombiano a Yen Japones",
                        "Convertir de peso Colombiano a Wom sul - Coreano",
                        "Convertir de Dolar a peso Colombiano",
                        "Convertir de Euro a peso Colombiano",
                        "Convertir de Libras Esterlinas a peso Colombiano",
                        "Convertir de Yen Japones a peso Colombiano",
                        "Convertir de Wom sul - Coreano a peso Colombiano"
                };

                String cambio = (String) JOptionPane.showInputDialog(null, "Elige una opción:", "Conversor de Divisas",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad:");
                double cantidad = 0.0;

                try {
                    cantidad = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    continue;
                }

                if (cambio.equals("Convertir de peso Colombiano a Dolar")) {
                    double dolar = cantidad * 0.00025;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Peso Colombiano es: " + formatearDivisa.format(dolar) + " Dolar.");
                } else if (cambio.equals("Convertir de peso Colombiano a Euro")) {
                    double euro = cantidad * 0.00022;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Peso Colombiano es: " + formatearDivisa.format(euro) + " Euro.");
                } else if (cambio.equals("Convertir de peso Colombiano a Libras Esterlinas")) {
                    double libras = cantidad * 0.0002;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Peso Colombiano es: " + formatearDivisa.format(libras)
                                    + " Libras Esterlinas.");
                } else if (cambio.equals("Convertir de peso Colombiano a Yen Japones")) {
                    double yen = cantidad * 0.03625;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Peso Colombiano es: " + formatearDivisa.format(yen) + " Yen.");
                } else if (cambio.equals("Convertir de peso Colombiano a Wom sul - Coreano")) {
                    double wom = cantidad * 0.32546;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Peso Colombiano es: " + formatearDivisa.format(wom) + " Wom.");
                } else if (cambio.equals("Convertir de Dolar a peso Colombiano")) {
                    double pesoColombiano = cantidad * 4108;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Dolar es: " + formatearDivisa.format(pesoColombiano) + " Peso Colombiano.");
                } else if (cambio.equals("Convertir de Euro a peso Colombiano")) {
                    double pesoColombiano = cantidad * 4496;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Euro es: " + formatearDivisa.format(pesoColombiano) + " Peso Colombiano.");
                } else if (cambio.equals("Convertir de Libras Esterlinas a peso Colombiano")) {
                    double pesoColombiano = cantidad * 0.0002;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Libras Esterlinas es: " + formatearDivisa.format(pesoColombiano)
                                    + " Peso Colombiano.");
                } else if (cambio.equals("Convertir de Yen Japones a peso Colombiano")) {
                    double pesoColombiano = cantidad * 0.03625;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Yen es: " + formatearDivisa.format(pesoColombiano) + " Peso Colombiano.");
                } else if (cambio.equals("Convertir de Wom sul - Coreano a peso Colombiano")) {
                    double pesoColombiano = cantidad * 0.32546;
                    JOptionPane.showMessageDialog(null,
                            cantidad + " Wom es: " + formatearDivisa.format(pesoColombiano) + " Peso Colombiano.");
                }

                int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                }
            }

            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            System.exit(0);
        }
        if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Eliga una opción :", "Conversor de temperatura Alura",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese Valor a convertir. ");
                double valor = 0.0;
                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + "Grados Celsius son: " + resultado + "Grados Fahrenheit ");

                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, valor + "Grados Fahre" + resultado + "Grados Celsius son: ");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas Seguir usando el Programa?", "",
                        JOptionPane.YES_NO_OPTION);

                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }

            }
        }
    }
}