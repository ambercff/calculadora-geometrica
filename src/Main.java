import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int figura, menuPlano, menuEspacial;
        double lado, base, altura, raio, comprimento, largura, arestaBase, apotema;
        String nome;

        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();

        while (true) {
            System.out.println(nome + ", qual tipo de forma você deseja calcular? \n1 - Plana \n2 - Espacial");
                figura = Integer.parseInt(ler.nextLine());

                if (figura == 1) {
                    while(true) {
                        try {
                            System.out.println("**** MENU DE OPÇÕES - PLANOS **** \n1 - Quadrado \n2 - Retângulo \n3 - Triângulo \n4 - Círculo " +
                                    " \n5 - Hexágono \n6 - Sair");
                            menuPlano = Integer.parseInt(ler.nextLine());
                            break;

                        } catch (NumberFormatException e) {
                            System.out.println("Digite um número inteiro!");
                        }
                    }


                    switch(menuPlano) {
                        case 1:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor do lado do quadrado: ");
                                    lado = Double.parseDouble(ler.nextLine());

                                    if (lado <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Quadrado quadrado = new Quadrado(lado);

                                    System.out.println(quadrado.retornarResumo(lado));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 2:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor da base do retângulo: ");
                                    base = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor da altura do retângulo: ");
                                    altura = Double.parseDouble(ler.nextLine());

                                    if (base <= 0 || altura <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Retangulo retangulo = new Retangulo(base, altura);

                                    System.out.println(retangulo.retornarResumo(base));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 3:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor do lado do triângulo: ");
                                    lado = Double.parseDouble(ler.nextLine());

                                    if (lado <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Triangulo triangulo = new Triangulo(lado);

                                    System.out.println(triangulo.retornarResumo(lado));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 4:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor do raio do círculo: ");
                                    raio = Double.parseDouble(ler.nextLine());

                                    if (raio <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Circulo circulo = new Circulo(raio);

                                    System.out.println(circulo.retornarResumo(raio));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 5:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor do lado do hexagono: ");
                                    lado = Double.parseDouble(ler.nextLine());

                                    if (lado <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Hexagono hexagono = new Hexagono(lado);

                                    System.out.println(hexagono.retornarResumo(lado));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 6:
                            ler.close();
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Opção inválida!");

                    }

                } else if (figura == 2) {
                    while (true) {
                        try {
                            System.out.println("**** MENU DE OPÇÕES - ESPACIAIS **** \n1 - Cubo \n2 - Paralelepípedo \n3 - Esfera \n4 - Pirâmide" +
                                    " \n5 - Cilindro \n6 - Cone \n7 - Sair");

                            menuEspacial = Integer.parseInt(ler.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Digite um número inteiro!");
                        }
                    }


                    switch (menuEspacial) {
                        case 1:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor do lado do cubo: ");
                                    lado = Double.parseDouble(ler.nextLine());

                                    if (lado <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Cubo cubo = new Cubo(lado);

                                    System.out.println(cubo.retornarResumo(lado));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 2:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor do comprimento do paralelepípedo: ");
                                    comprimento = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor da altura do paralelepípedo: ");
                                    altura = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor da largura do paralelepípedo: ");
                                    largura = Double.parseDouble(ler.nextLine());


                                    if (comprimento <= 0 || altura <= 0 || largura <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);

                                    System.out.println(paralelepipedo.retornarResumo(comprimento));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;
                        case 3:
                            while (true) {
                                try {
                                    System.out.println(nome + ", informe o valor do raio da esfera: ");
                                    raio = Double.parseDouble(ler.nextLine());

                                    if (raio <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Esfera esfera = new Esfera(raio);

                                    System.out.println(esfera.retornarResumo(raio));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;


                        case 4:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor da aresta da base: ");
                                    arestaBase = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor do apotema: ");
                                    apotema = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor da altura: ");
                                    altura = Double.parseDouble(ler.nextLine());


                                    if (arestaBase <= 0 || apotema <= 0 || altura <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Piramide piramide = new Piramide(arestaBase, apotema, altura);

                                    System.out.println(piramide.retornarResumo(arestaBase));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;

                        case 5:
                            while(true) {
                                try {
                                    System.out.println(nome + ", informe o valor da altura do cilindro: ");
                                    altura = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor do raio da base do cilindro: ");
                                    raio = Double.parseDouble(ler.nextLine());

                                    if (altura <= 0 || raio <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Cilindro cilindro = new Cilindro(altura, raio);

                                    System.out.println(cilindro.retornarResumo(altura));;
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                            break;


                        case 6:
                            while (true) {
                                try {
                                    System.out.println(nome + ", informe o valor do raio da base do cone: ");
                                    raio = Double.parseDouble(ler.nextLine());

                                    System.out.println(nome + ", informe o valor da altura do cone: ");
                                    altura = Double.parseDouble(ler.nextLine());

                                    if (raio <= 0 || altura <= 0) {
                                        System.out.println("Digite um número maior do que 0!");
                                        continue;
                                    }

                                    Cone cone = new Cone(raio, altura);

                                    System.out.println(cone.retornarResumo(raio));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Digite um número!");
                                }
                            }
                        break;

                        case 7:
                            ler.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } else {
                    System.out.println("Opção inválida!");
                }
        }


    }
}