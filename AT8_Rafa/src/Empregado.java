//Nome: José Wanderlei de Moraes Junior
//Obs: O codigo está com erros que eu não consegui corrigir
class Empregado {
    private String nome;
    private int idade;
    private double salario;
    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String toString() {
        return "Nome: "+ nome+", Idade: "+idade + ", Salário: R$ " +salario;
    }
    public void promover() {
        if (idade > 18) {
            aumentarSalario(0.25);
            System.out.println("Promoção realizada com sucesso!");
        } else {
            System.out.println("O funcionário deve ter mais de 18 anos para ser promovido.");
        }
    }
    public void aumentarSalario(double percentual){
        salario += salario * (percentual / 100);
    }

    public void demitir(int motivo){
        switch (motivo){
            case 1:
                System.out.println("Justa causa para demissão!");
            case 2:
                double multa = salario * 0.4;
                salario -= multa;
                System.out.println("Demitido por decisão do empregador!");
            case 3:
                double salarioAposentadoria;
                if (salario > 1000 || salario < 2000){
                    salarioAposentadoria = 1500;
                }
                else if (salario > 2000 || salario <3000){
                    salarioAposentadoria = 2500;
                }
                else if (salario > 3000 || salario < 4000){
                    salarioAposentadoria = 3500;
                }
                else if (salario > 4000){
                    salarioAposentadoria = 4000;
                }
        }

                }
    public void fazerAniversario(){
        idade ++;
    }

    }
