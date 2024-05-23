//Nome: José Wanderlei de Moraes Junior
//Obs: O codigo está com erros que eu não consegui corrigir
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    Scanner input = new Scanner(System.in);
    ArrayList<Empregado> empregados = new ArrayList<>();

    public static void main(String[] args) {
    int op = 0;
        Scanner input = new Scanner(System.in);
        //MENU DE OPÇOES

        while (op !=7){

            System.out.println("[1]-Criar novo empregado" +
                    "[2]-Promover empregado" +
                    "[3]-Aumentar salario do empregado" +
                    "[4]-Demitir Empregado" +
                    "[5]-Fazer aniversario do empregado" +
                    "[6]-Mostrar detalhes do empregado" +
                    "[7] *SAIR*");
            op = input.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Nome: ");
                    String nome = input.nextLine();
                    System.out.println("Idade: ");
                    int idade = input.nextInt();
                    System.out.println("Salário: ");
                    double salario = input.nextDouble();
                    input.nextLine();
                    empregados.add(new Empregado(nome, idade, salario));
                    System.out.println("Novo empregado cadastrado!");
                    break;
                }
                case 2 -> {
                    System.out.println("Lista de empregados cadastrados");
                    if (empregados != null) {
                        listarEmpregados(empregados);
                        System.out.println("Qual empregado deseja promover: ");
                        int empregadoPromo = input.nextInt();
                        empregados.get(empregadoPromo).promover();
                    } else
                        System.out.println("Empregado nao encontrado!");
                }
                case 3 -> {
                    if (empregado != null) {
                        listarEmpregados(empregados);
                        System.out.println("Qual empregado deve receber aumento: ");
                        int empregadoAumen = input.nextInt();
                        System.out.println("Quandos por cento de aumento: ");
                        double percentualAumen = input.nextDouble();
                        empregados.get(empregadoAumen).aumentarSalario(percentualAumen);
                    } else
                        System.out.println("Empregado nao encontrado!");
                }
                case 4 -> {
                    if (empregado != null) {
                        listarEmpregados(empregados);
                        System.out.println("Qual empregado deve ser demitido: ");
                        int empregadoDemitir = input.nextInt();
                        System.out.print("Motivo da demissão (1: Justa causa, 2: Decisão do empregador, 3: Aposentadoria): ");
                        int motivo = input.nextInt();
                        empregado.demitir(motivo);
                    } else
                        System.out.println("Empregado nao encontrado!");

                }
                case 5 -> {
                    if (empregado != null) {
                        listarEmpregados(empregados);
                        System.out.println("Qual empregado está fazendo aniversario: ");
                        int empregadoAniver = input.nextInt();
                        empregados.get(empregadoAniver).fazerAniversario();

                    } else
                        System.out.println("Empregado nao encontrado!");

                }
                case 6 -> {
                    if (empregado != null) {
                        System.out.println("Lista de empregados");
                        listarEmpregados(empregados);

                    }

                }
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        }
    }


