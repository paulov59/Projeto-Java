
import java.io.*;
import java.util.*;

/**
 *
 * @author paulov59
 */
public class iSoccer {

    private static String funcionarios[][] = new String[100][9];
    private static String socios[][] = new String[100][8];
    private static String recursos[][] = new String[3][6];

    private static int func = 0;
    private static int soc = 0;
    private static int flag = 0;

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        clear();
        System.out.println("Bem vindo ao iSoccer!\n");
        System.out.print("Nome de usuario: ");
        String usuario = input.nextLine();
        System.out.print("Senha: ");
        String senha = input.nextLine();

        while (!usuario.equals("admin") || !senha.equals("admin")) {
            clear();
            System.out.println("Bem vindo ao iSoccer!\n");
            System.out.println("Usuário ou senha invalidos!");
            System.out.print("Nome de usuario: ");
            usuario = input.nextLine();
            System.out.print("Senha: ");
            senha = input.nextLine();
        }
        clear();
        int op = 1;
        do {
            clear();
            if (op > 7 || op < 1) {
                System.out.println("Opção inválida!");
            }
            op = menu();
        } while (op != 7);

        clear();
        System.out.println("Obrigado por usar o iSoccer!");

    }

    public static int menu() {
        System.out.println("Selecione:");
        System.out.println("\t1 - Adicionar funcionários");
        System.out.println("\t2 - Adicionar sócio");
        System.out.println("\t3 - Modificar cadastro");
        System.out.println("\t4 - Gerenciar recursos físicos");
        System.out.println("\t5 - Buscar");
        System.out.println("\t6 - Relatórios");
        System.out.println("\t7 - Sair");

        int op = input.nextInt();

        switch (op) {
            case 1:
                adicionarFuncionario();
                break;
            case 2:
                adicionarSocio();
                break;
            case 3:
                modificar();
                break;
            case 4:
                gerenciarRecursos();
                break;
            case 5:
                busca();
                break;
            case 6:
                relatorios();
                break;
            default:
                break;
        }
        return op;
    }

    public static void adicionarFuncionario() {
        clear();
        System.out.println("Selecione:");
        System.out.println("\t1 - para adicionar presidente");
        System.out.println("\t2 - para adicionar médico");
        System.out.println("\t3 - para adicionar técnico");
        System.out.println("\t4 - para adicionar preparador físico");
        System.out.println("\t5 - para adicionar motorista");
        System.out.println("\t6 - para adicionar cozinheiro");
        System.out.println("\t7 - para adicionar advogado");
        System.out.println("\t8 - para adicionar jogador");
        System.out.println("\t9 - para sair");

        int op = input.nextInt();
        String aux = input.nextLine();
        clear();

        switch (op) {
            case 1:
                funcionarios[func][0] = "Presidente";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 2:
                funcionarios[func][0] = "Medico";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o CRM: ");
                funcionarios[func][6] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 3:
                funcionarios[func][0] = "Tecnico";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 4:
                funcionarios[func][0] = "Preparador fisico";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 5:
                funcionarios[func][0] = "Motorista";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o CNH: ");
                funcionarios[func][6] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 6:
                funcionarios[func][0] = "Cozinheiro";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 7:
                funcionarios[func][0] = "Advogado";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][5] = input.nextLine();
                func++;
                break;
            case 8:
                funcionarios[func][0] = "Jogador";
                System.out.print("Insira o nome completo: ");
                funcionarios[func][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                funcionarios[func][2] = input.nextLine();
                System.out.print("Insira o posição: ");
                funcionarios[func][3] = input.nextLine();
                System.out.print("Insira o número da camisa: ");
                funcionarios[func][4] = input.nextLine();
                System.out.print("Insira o email: ");
                funcionarios[func][5] = input.nextLine();
                System.out.print("Insira o salário: R$ ");
                funcionarios[func][6] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                funcionarios[func][7] = input.nextLine();
                funcionarios[func][8] = "apto";
                func++;
                break;
            case 9:
                break;
            default:
                System.out.println("Opção inválida!");
                adicionarFuncionario();
                break;
        }
    }

    public static void adicionarSocio() {
        clear();
        System.out.println("Selecione:");
        System.out.println("\t1 - para adicionar Sócio Júnior");
        System.out.println("\t2 - para adicionar Sócio Sênior");
        System.out.println("\t3 - para adicionar Sócio Elite");
        System.out.println("\t4 - para sair");

        int op = input.nextInt();
        String aux = input.nextLine();
        clear();

        switch (op) {
            case 1:
                socios[soc][0] = "junior";
                System.out.print("Insira o nome completo: ");
                socios[soc][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                socios[soc][2] = input.nextLine();
                System.out.print("Insira o email: ");
                socios[soc][3] = input.nextLine();
                System.out.print("Insira o valor da contribuição: R$ ");
                socios[soc][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                socios[soc][5] = input.nextLine();
                socios[soc][6] = "adimplente";
                soc++;
                break;
            case 2:
                socios[soc][0] = "senior";
                System.out.print("Insira o nome completo: ");
                socios[soc][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                socios[soc][2] = input.nextLine();
                System.out.print("Insira o email: ");
                socios[soc][3] = input.nextLine();
                System.out.print("Insira o valor da contribuição: R$ ");
                socios[soc][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                socios[soc][5] = input.nextLine();
                socios[soc][6] = "adimplente";
                soc++;
                break;
            case 3:
                socios[soc][0] = "elite";
                System.out.print("Insira o nome completo: ");
                socios[soc][1] = input.nextLine();
                System.out.print("Insira o CPF: ");
                socios[soc][2] = input.nextLine();
                System.out.print("Insira o email: ");
                socios[soc][3] = input.nextLine();
                System.out.print("Insira o valor da contribuição: R$ ");
                socios[soc][4] = input.nextLine();
                System.out.print("Insira o número de telefone: ");
                socios[soc][5] = input.nextLine();
                socios[soc][6] = "adimplente";
                soc++;
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
                adicionarSocio();
                break;
        }
    }

    public static void modificar() {
        clear();
        System.out.println("Selecione:");
        System.out.println("\t1 - para modificar cadastro de jogador");
        System.out.println("\t2 - para modificar cadastro de sócio");
        System.out.println("\t3 - para sair");

        int i, mod = 0;
        int op = input.nextInt();
        String cpf;
        String aux = input.nextLine();
        clear();

        switch (op) {
            case 1:
                System.out.println("Digite o CPF do jogador: ");
                cpf = input.nextLine();
                for (i = 0; i < func; i++) {
                    if (funcionarios[i][0].equals("jogador")) {
                        if (funcionarios[i][2].equals(cpf)) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 1) {
                    System.out.println("Nome: " + funcionarios[i][1]);
                    System.out.println("Posição: " + funcionarios[i][3]);
                    mod = 0;
                    while (mod != 6) {
                        System.out.println("Selecione:");
                        System.out.println("\t1 - para modificar número da camisa");
                        System.out.println("\t2 - para modificar email");
                        System.out.println("\t3 - para modificar salário");
                        System.out.println("\t4 - para modificar número de telefone");
                        System.out.println("\t5 - para modificar condição física");
                        System.out.println("\t6 - para sair");
                        mod = input.nextInt();
                        aux = input.nextLine();
                        if (mod == 1) {
                            System.out.print("Insira o número da camisa: ");
                            funcionarios[func][4] = input.nextLine();
                        } else if (mod == 2) {
                            System.out.print("Insira o email: ");
                            funcionarios[i][5] = input.nextLine();
                        } else if (mod == 3) {
                            System.out.print("Insira o salário: R$ ");
                            funcionarios[i][6] = input.nextLine();
                        } else if (mod == 4) {
                            System.out.print("Insira o número de telefone: ");
                            funcionarios[i][7] = input.nextLine();
                        } else if (mod == 5) {
                            System.out.println("Selecione:");
                            System.out.println("\t1 - para apto");
                            System.out.println("\t2 - para machucado");
                            int var = input.nextInt();
                            if (var == 1) {
                                funcionarios[i][8] = "apto";
                            } else if (var == 2) {
                                funcionarios[i][8] = "machucado";
                            }
                        } else if (mod > 6 || mod < 1) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    flag = 0;
                } else {
                    System.out.println("Jogador não encontrado!\nPressioner ENTER para prosseguir.");
                    aux = input.nextLine();
                }
                break;
            case 2:
                System.out.println("Digite o CPF do sócio: ");
                cpf = input.nextLine();
                for (i = 0; i < func; i++) {
                    if (socios[i][2].equals(cpf)) {
                        socf = 1;
                        break;
                    }
                }
                if (socf == 1) {
                    System.out.println("Nome: " + socios[i][1]);
                    mod = 0;
                    while (mod != 6) {
                        System.out.println("Selecione:");
                        System.out.println("\t2 - para modificar email");
                        System.out.println("\t3 - para modificar valor contribuição");
                        System.out.println("\t4 - para modificar número de telefone");
                        System.out.println("\t5 - para modificar a condição");
                        System.out.println("\t6 - para sair");
                        mod = input.nextInt();
                        aux = input.nextLine();
                        if (mod == 1) {
                            System.out.println("Selecione:");
                            System.out.println("\t1 - para adicionar Sócio Júnior");
                            System.out.println("\t2 - para adicionar Sócio Sênior");
                            System.out.println("\t3 - para adicionar Sócio Elite");
                            op = input.nextInt();
                            switch (op) {
                                case 1:
                                    socios[soc][0] = "junior";
                                    break;
                                case 2:
                                    socios[soc][0] = "senior";
                                    break;
                                case 3:
                                    socios[soc][0] = "elite";
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }
                        } else if (mod == 2) {
                            System.out.print("Insira o email: ");
                            socios[i][3] = input.nextLine();
                        } else if (mod == 3) {
                            System.out.print("Insira o valor da contribuição: R$ ");
                            socios[i][4] = input.nextLine();
                        } else if (mod == 4) {
                            System.out.print("Insira o número de telefone: ");
                            socios[i][5] = input.nextLine();
                        } else if (mod == 5) {
                            System.out.println("Selecione:");
                            System.out.print("\t1 - para adimplente");
                            System.out.println("\t2 - para inadimplente");
                            int esc = input.nextInt();
                            if (esc == 1) {
                                socios[i][6] = "adimplente";
                            } else {
                                socios[i][6] = "inadimplente";
                            }
                        } else if (mod > 6 || mod < 1) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    socf = 0;
                } else {
                    System.out.println("Sócio não encontrado!\nPressioner ENTER para prosseguir.");
                    aux = input.nextLine();
                }
                break;
            default:
                break;
        }
    }

    public static void gerenciarRecursos() {
        clear();
        System.out.println("Selecione:");
        System.out.println("\t1 - para gerenciar ônibus");
        System.out.println("\t2 - para gerenciar estádio");
        System.out.println("\t3 - para gerenciar centro de treinamento");
        System.out.println("\t4 - para sair");

        int op = input.nextInt();
        String aux = input.nextLine();
        clear();

        switch (op) {
            case 1:
                if (recursos[0][0] == null || recursos[0][0].equals("0")) {
                    System.out.print("Ônibus não encontrado. Deseja adicionar agora? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        recursos[0][0] = "1";
                        System.out.print("Insira a marca do ônibus: ");
                        recursos[0][1] = input.nextLine();
                        System.out.print("Insira o modelo do ônibus: ");
                        recursos[0][2] = input.nextLine();
                        System.out.print("Insira a placa do ônibus: ");
                        recursos[0][3] = input.nextLine();
                        System.out.print("Insira a quantidade de assentos: ");
                        recursos[0][4] = input.nextLine();
                        recursos[0][5] = "Disponivel";
                    }
                } else {
                    System.out.print("Ônibus " + recursos[0][3] + " encontrado. Deseja mais informações sobre o modelo? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        System.out.println("\tMarca: " + recursos[0][1]);
                        System.out.println("\tModelo: " + recursos[0][2]);
                        System.out.println("\tPlaca: " + recursos[0][3]);
                        System.out.println("\tQuantidade de assentos: " + recursos[0][4]);
                        System.out.println("\tSituação: " + recursos[0][5]);
                    }

                    System.out.print("Deseja modificar alguma informação? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        System.out.println("Selecione:");
                        System.out.println("\t1 - para remover o ônibus");
                        System.out.println("\t2 - para trocar de ônibus");
                        System.out.println("\t3 - para modificar situação");

                        int mod = input.nextInt();
                        aux = input.nextLine();
                        clear();

                        if (mod == 1) {
                            recursos[0][0] = "0";
                        } else if (mod == 2){
                            System.out.print("Insira a marca do ônibus: ");
                            recursos[0][1] = input.nextLine();
                            System.out.print("Insira o modelo do ônibus: ");
                            recursos[0][2] = input.nextLine();
                            System.out.print("Insira a placa do ônibus: ");
                            recursos[0][3] = input.nextLine();
                            System.out.print("Insira a quantidade de assentos: ");
                            recursos[0][4] = input.nextLine();
                            recursos[0][5] = "disponivel";
                        } else if (mod == 3) {
                            System.out.println("Selecione:");
                            System.out.println("\t1 - para 'Disponível'");
                            System.out.println("\t2 - para 'Indisponível'");
                            mod = input.nextInt();
                            aux = input.nextLine();
                            if (mod == 1) {
                                recursos[0][5] = "Disponivel";
                            } else {
                                recursos[0][5] = "Indisponivel";
                            }
                        }
                    }
                }
                break;
            case 2:
                if (recursos[1][0] == null || recursos[1][0].equals("0")) {
                    System.out.print("Estádio não encontrado. Deseja adicionar agora? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        recursos[1][0] = "1";
                        System.out.print("Insira o nome do estádio: ");
                        recursos[1][1] = input.nextLine();
                        System.out.print("Insira o apelido do estádio: ");
                        recursos[1][2] = input.nextLine();
                        System.out.print("Insira a capacidade: ");
                        recursos[1][3] = input.nextLine();
                        System.out.print("Insira a quantidade de lanchonetes: ");
                        recursos[1][4] = input.nextLine();
                        System.out.print("Insira a quantidade de banheiros: ");
                        recursos[1][5] = input.nextLine();
                    }
                } else {
                    System.out.print("Estádio " + recursos[1][1] + " encontrado. Deseja mais informações? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        System.out.println("\tApelido: " + recursos[1][2]);
                        System.out.println("\tCapacidade: " + recursos[1][3]);
                        System.out.println("\tQuantidade de lanchonetes: " + recursos[1][4]);
                        System.out.println("\tQuantidade de banheiros: " + recursos[1][5]);
                    }

                    System.out.print("Deseja modificar alguma informação? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        System.out.println("Selecione:");
                        System.out.println("\t1 - para remover o estádio");
                        System.out.println("\t2 - para alterar o nome");
                        System.out.println("\t3 - para alterar o apelido");
                        System.out.println("\t4 - para alterar a capacidade");
                        System.out.println("\t5 - para alterar a quantidade de lanchonetes");
                        System.out.println("\t6 - para alterar a quantidade de banheiros");
                        System.out.println("\t7 - para trocar de estádio");

                        int mod = input.nextInt();
                        aux = input.nextLine();
                        clear();

                        if (mod == 1) {
                            recursos[1][0] = "0";
                        } else if (mod == 2) {
                            System.out.print("Insira o novo nome do estádio: ");
                            recursos[1][1] = input.nextLine();
                        } else if (mod == 3) {
                            System.out.print("Insira o novo apelido do estádio: ");
                            recursos[1][2] = input.nextLine();
                        } else if (mod == 4) {
                            System.out.print("Insira a nova capacidade do estádio: ");
                            recursos[1][3] = input.nextLine();
                        } else if (mod == 5) {
                            System.out.print("Insira a nova quantidade de lanchonetes: ");
                            recursos[1][4] = input.nextLine();
                        } else if (mod == 6) {
                            System.out.print("Insira a nova quantidade de banheiros: ");
                            recursos[1][5] = input.nextLine();
                        } else if (mod == 7){
                            System.out.print("Insira o nome do estádio: ");
                            recursos[1][1] = input.nextLine();
                            System.out.print("Insira o apelido do estádio: ");
                            recursos[1][2] = input.nextLine();
                            System.out.print("Insira a capacidade: ");
                            recursos[1][3] = input.nextLine();
                            System.out.print("Insira a quantidade de lanchonetes: ");
                            recursos[1][4] = input.nextLine();
                            System.out.print("Insira a quantidade de banheiros: ");
                            recursos[1][5] = input.nextLine();
                        }
                    }
                }
                break;
            case 3:
                if (recursos[2][0] == null || recursos[2][0].equals("0")) {
                    System.out.print("Centro de treinamento não encontrado. Deseja adicionar agora? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        recursos[2][0] = "1";
                        System.out.print("Insira o nome do CT: ");
                        recursos[2][1] = input.nextLine();
                        System.out.print("Insira a quantidade de quartos: ");
                        recursos[2][2] = input.nextLine();
                        System.out.print("Insira a quantidade de campos: ");
                        recursos[2][3] = input.nextLine();
                    }
                } else {
                    System.out.print("Centro de treinamento " + recursos[2][1] + " encontrado. Deseja mais informações? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        System.out.println("\tNome: " + recursos[2][1]);
                        System.out.println("\tQuantidade de quartos: " + recursos[2][2]);
                        System.out.println("\tQuantidade de campos: " + recursos[2][3]);
                    }

                    System.out.print("Deseja modificar alguma informação? (s/n) ");
                    aux = input.nextLine();
                    if (aux.equals("s") || aux.equals("S")) {
                        System.out.println("Selecione:");
                        System.out.println("\t1 - para remover o centro de treinamento");
                        System.out.println("\t2 - para alterar a quantidade de quartos");
                        System.out.println("\t3 - para alterar a quantidade de campo");

                        int mod = input.nextInt();
                        aux = input.nextLine();
                        clear();

                        if (mod == 1) {
                            recursos[1][0] = "0";
                        } else if (mod == 2){
                            System.out.print("Insira a quantidade de quartos: ");
                            recursos[2][2] = input.nextLine();
                        } else if (mod == 2) {
                            System.out.print("Insira a quantidade de campos: ");
                            recursos[2][3] = input.nextLine();
                        }
                    }
                }
                break;
            default:
                break;
        }

    }

    public static void busca() {
        clear();
        System.out.println("Selecione:");
        System.out.println("\t1 - para buscar funcionário");
        System.out.println("\t2 - para buscar sócio");
        System.out.println("\t3 - para sair");

        int op = input.nextInt();
        String aux = input.nextLine();
        clear();

        switch (op) {
            case 1:
                clear();
                System.out.println("Selecione:");
                System.out.println("\t1 - para buscar treinador/jogador");
                System.out.println("\t2 - para buscar funcionário gerais");

                int mod = input.nextInt();
                aux = input.nextLine();
                clear();

                if (mod == 1) {
                    System.out.println("Insira o CPF que deseja buscar: ");
                    aux = input.nextLine();
                    for (int i = 0; i < func; i++) {
                        if (funcionarios[i][2].equals(aux)) {
                            if (funcionarios[i][0].equals("Jogador")) {
                                System.out.println("\tNome: " + funcionarios[i][1]);
                                System.out.println("\tCPF: " + funcionarios[i][2]);
                                System.out.println("\tPosição: " + funcionarios[i][3]);
                                System.out.println("\tNúmero da camisa: " + funcionarios[i][4]);
                                System.out.println("\tEmail: " + funcionarios[i][5]);
                                System.out.println("\tSalário: R$ " + funcionarios[i][6]);
                                System.out.println("\tNúmero de telefone: " + funcionarios[i][7]);
                                System.out.println("\tCondição: " + funcionarios[i][8] + "\n");
                                flag = 1;
                                break;
                            } else {
                                System.out.println("Treinador:");
                                System.out.println("\tNome: " + funcionarios[i][1]);
                                System.out.println("\tCPF: " + funcionarios[i][2]);
                                System.out.println("\tEmail: " + funcionarios[i][3]);
                                System.out.println("\tSalário: R$ " + funcionarios[i][4]);
                                System.out.println("\tNúmero de telefone: " + funcionarios[i][5]);
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            System.out.println("Funcionário não encontrado");
                        }
                        flag = 0;
                    }
                } else {
                    System.out.println("Insira o CPF que deseja buscar: ");
                    aux = input.nextLine();
                    for (int i = 0; i < func; i++) {
                        if (!funcionarios[i][0].equals("Tecnico") && !funcionarios[i][0].equals("Jogador")) {
                            if (funcionarios[i][2].equals(aux)) {
                                System.out.println("\tNome: " + funcionarios[i][1]);
                                System.out.println("\tCPF: " + funcionarios[i][2]);
                                System.out.println("\tCargo: " + funcionarios[i][0]);
                                if (funcionarios[i][0].equals("Medico")) {
                                    System.out.println("\tCRM: " + funcionarios[i][6]);
                                } else if (funcionarios[i][0].equals("Motorista")) {
                                    System.out.println("\tCNH: " + funcionarios[i][6]);
                                }
                                System.out.println("\tEmail: " + funcionarios[i][3]);
                                System.out.println("\tSalário: R$ " + funcionarios[i][4]);
                                System.out.println("\tNúmero de telefone: " + funcionarios[i][5] + "\n");
                                flag = 1;
                                break;
                            }
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Funcionário não encontrado");
                    }
                    flag = 0;
                }
                break;
            case 2:
                System.out.println("Insira o CPF que deseja buscar: ");
                aux = input.nextLine();

                for (int i = 0; i < soc; i++) {
                    if (socios[i][2].equals(aux)) {
                        System.out.println("\tTipo de plano: " + socios[i][0]);
                        System.out.println("\tNome: " + socios[i][1]);
                        System.out.println("\tCPF: " + socios[i][2]);
                        System.out.println("\tEmail: " + socios[i][3]);
                        System.out.println("\tValor da contribuição: R$ " + socios[i][4]);
                        System.out.println("\tNúmero de telefone: " + socios[i][5]);
                        System.out.println("\tSituação: " + socios[i][6] + "");   
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("Sócio não encontrado");
                }
                flag = 0;
                break;
            default:
                break;
        }
        System.out.println("Pressioner ENTER para prosseguir.");
        input.nextLine();

    }

    public static void relatorios() {
        clear();
        System.out.println("Selecione:");
        System.out.println("\t1 - para relatório de funcionários");
        System.out.println("\t2 - para relatório de sócios");
        System.out.println("\t3 - para sair");

        int op = input.nextInt();
        String aux = input.nextLine();
        clear();

        switch (op) {
            case 1:
                clear();
                System.out.println("Selecione:");
                System.out.println("\t1 - para relatório do time");
                System.out.println("\t2 - para relatório de serviços gerais");

                int mod = input.nextInt();
                aux = input.nextLine();
                clear();
                
                if (mod == 1) {
                    for (int i = 0; i < func; i++) {
                        if (funcionarios[i][0].equals("Tecnico")) {
                            System.out.println("Treinador:");
                            System.out.println("\tNome: " + funcionarios[i][1]);
                            System.out.println("\tCPF: " + funcionarios[i][2]);
                            System.out.println("\tEmail: " + funcionarios[i][3]);
                            System.out.println("\tSalário: R$ " + funcionarios[i][4]);
                            System.out.println("\tNúmero de telefone: " + funcionarios[i][5]);
                            break;
                        }
                    }
                    System.out.println("Jogadores:");
                    for (int i = 0; i < func; i++) {
                        if (funcionarios[i][0].equals("Jogador")) {
                            System.out.println("\tNome: " + funcionarios[i][1]);
                            System.out.println("\tCPF: " + funcionarios[i][2]);
                            System.out.println("\tPosição: " + funcionarios[i][3]);
                            System.out.println("\tNúmero da camisa: " + funcionarios[i][4]);
                            System.out.println("\tEmail: " + funcionarios[i][5]);
                            System.out.println("\tSalário: R$ " + funcionarios[i][6]);
                            System.out.println("\tNúmero de telefone: " + funcionarios[i][7]);
                            System.out.println("\tCondição: " + funcionarios[i][8] + "\n");
                            flag = 1;
                        }
                        if (flag == 0) {
                            System.out.println("Não há jogadores cadastrados");
                        }
                        flag = 0;
                    }
                } else if (mod == 2) {
                    for (int i = 0; i < func; i++) {
                        if (!funcionarios[i][0].equals("Tecnico") && !funcionarios[i][0].equals("Jogador")) {
                            System.out.println("\tNome: " + funcionarios[i][1]);
                            System.out.println("\tCPF: " + funcionarios[i][2]);
                            System.out.println("\tCargo: " + funcionarios[i][0]);
                            if (funcionarios[i][0].equals("Medico")) {
                                System.out.println("\tCRM: " + funcionarios[i][6]);
                            } else if (funcionarios[i][0].equals("Motorista")) {
                                System.out.println("\tCNH: " + funcionarios[i][6]);
                            }
                            System.out.println("\tEmail: " + funcionarios[i][3]);
                            System.out.println("\tSalário: R$ " + funcionarios[i][4]);
                            System.out.println("\tNúmero de telefone: " + funcionarios[i][5] + "\n");
                        }
                    }
                }
                break;
            case 2:
                clear();
                int ad = 0, inad = 0;
                System.out.println("Quantidade de sócios: " + soc);
                for (int i = 0; i < soc; i++) {
                    if (socios[i][6].equals("adimplente")) {
                        ad++;
                    } else {
                        inad++;
                    }
                }
                System.out.println("Adimplentes: " + ad);
                System.out.println("Inadimplente: " + inad);
                System.out.print("\nDeseja uma lista de sócios? (s/n) ");
                aux = input.nextLine();
                if (aux.equals("s") || aux.equals("S")) {
                    for (int i = 0; i < soc; i++) {
                        System.out.println("\tTipo de plano: " + socios[i][0]);
                        System.out.println("\tNome: " + socios[i][1]);
                        System.out.println("\tCPF: " + socios[i][2]);
                        System.out.println("\tEmail: " + socios[i][3]);
                        System.out.println("\tValor da contribuição: R$ " + socios[i][4]);
                        System.out.println("\tNúmero de telefone: " + socios[i][5]);
                        System.out.println("\tSituação: " + socios[i][6] + "");
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("Pressioner ENTER para prosseguir.");
        aux = input.nextLine();
    }

    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
