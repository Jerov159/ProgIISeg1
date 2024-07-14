package EstructuraMenu;

import javax.swing.*;

import javax.swing.JOptionPane;

public class Estructura {
    public static void main(String[] args) {
        int codMenuPal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInternacional = 0;
        int contadorTipico = 0, contadorCarta = 0, contadorInternacional = 0;
        int totalPagar = 0;
        String nombreUsuario = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");
        StringBuilder factura = new StringBuilder();

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Típico\n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Imprimir Factura y Salir\n\n";
            menu += "Por favor seleccione una opción \n";
            codMenuPal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPal) {
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO\n\n";
                        menuTipico += "1. Frijoles ($12000)\n";
                        menuTipico += "2. Sopa de Verduras ($8000)\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opción \n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $12000");
                                contadorTipico++;
                                totalPagar += 12000;
                                factura.append("Frijoles: $12000\n");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de Verduras, el costo es de $8000");
                                contadorTipico++;
                                totalPagar += 8000;
                                factura.append("Sopa de Verduras: $8000\n");
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        if (codMenuTipico != 3) {
                            codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea pedir otro plato típico, de lo contrario regresará al menú principal"));
                            if (codMenuTipico != 1) {
                                codMenuTipico = 3;
                            }
                        }
                    } while (codMenuTipico != 3);
                    break;

                case 2:
                    do {
                        String menuCarta = "MENU CARTA\n\n";
                        menuCarta += "1. Bandeja Paisa ($15000)\n";
                        menuCarta += "2. Ajiaco ($10000)\n";
                        menuCarta += "3. Regresar\n\n";
                        menuCarta += "Por favor seleccione una opción \n";
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                        switch (codMenuCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Bandeja Paisa, el costo es de $15000");
                                contadorCarta++;
                                totalPagar += 15000;
                                factura.append("Bandeja Paisa: $15000\n");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Ajiaco, el costo es de $10000");
                                contadorCarta++;
                                totalPagar += 10000;
                                factura.append("Ajiaco: $10000\n");
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        if (codMenuCarta != 3) {
                            codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea pedir otro plato a la carta, de lo contrario regresará al menú principal"));
                            if (codMenuCarta != 1) {
                                codMenuCarta = 3;
                            }
                        }
                    } while (codMenuCarta != 3);
                    break;

                case 3:
                    do {
                        String menuInternacional = "MENU INTERNACIONAL\n\n";
                        menuInternacional += "1. Pizza ($20000)\n";
                        menuInternacional += "2. Sushi ($25000)\n";
                        menuInternacional += "3. Regresar\n\n";
                        menuInternacional += "Por favor seleccione una opción \n";
                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                        switch (codMenuInternacional) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Pizza, el costo es de $20000");
                                contadorInternacional++;
                                totalPagar += 20000;
                                factura.append("Pizza: $20000\n");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado Sushi, el costo es de $25000");
                                contadorInternacional++;
                                totalPagar += 25000;
                                factura.append("Sushi: $25000\n");
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        if (codMenuInternacional != 3) {
                            codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea pedir otro plato internacional, de lo contrario regresará al menú principal"));
                            if (codMenuInternacional != 1) {
                                codMenuInternacional = 3;
                            }
                        }
                    } while (codMenuInternacional != 3);
                    break;

                case 4:
                    String facturaFinal = "FACTURA\n\n";
                    facturaFinal += "Cliente: " + nombreUsuario + "\n\n";
                    facturaFinal += "Detalle de la compra:\n";
                    facturaFinal += factura.toString();
                    facturaFinal += "\nResumen:\n";
                    facturaFinal += "Platos típicos: " + contadorTipico + "\n";
                    facturaFinal += "Platos a la carta: " + contadorCarta + "\n";
                    facturaFinal += "Platos internacionales: " + contadorInternacional + "\n";
                    facturaFinal += "\nTotal a pagar: $" + totalPagar;

                    JOptionPane.showMessageDialog(null, facturaFinal, "Factura", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Gracias por su compra, " + nombreUsuario + ". ¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPal != 4);
    }
}

//Plato tipico, plato carta, plato internacional, Salir