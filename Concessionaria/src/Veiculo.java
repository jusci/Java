
public class Veiculo {
	
	private String tipo;
    private String modelo;
    private String cor;
    private boolean ligado= false;
    private char marcha;
    private double velocidade;



    public Veiculo (String tipo,String modelo,String cor,char marcha,double velocidade) {// construtor da classe

        this.setTipo(tipo);
        this.setModelo(modelo);
        this.setCor(cor);
        this.setMarcha(marcha);
        this.setVelocidade(velocidade);
        this.ligar();
        this.verificarMarcha();


    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;

    }

    public String getModelo() {

        return this.modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor=cor;
    }

    public boolean getLigado() {

        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado=ligado;
    }
    public char getMarcha() {
        return this.marcha;
    }
    public void setMarcha(char marcha) {
        this.marcha = marcha;
    }


    public double getVelocidade() {
        return this.velocidade;
    }


    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }




    public void ligar() {
        this.ligado = false;
    }




    public void calcularVelocidade(){

        double velMax;
        double porcentagem;
        if(tipo =="Carro") {
            velMax=220;

            porcentagem=(velMax/100)*80;

            System.out.printf("porcentagem"+porcentagem);
            if(this.getVelocidade()==porcentagem) {

                System.out.println("Voc� atingiu 80% porcento da velocidade permitida");

            }
        }

    }

    public void desligar(){
        this.ligado=true;
    }

    public void status() {

        System.out.println ("Sobre o Ve�culo");
        System.out.println("Tipo:" +this.getTipo());
        System.out.println("Modelo:" +this.getModelo());
        System.out.println("Cor:" +this.getCor());
        System.out.println("Ligado:"+this.getLigado());
        System.out.println ("Marcha:"+this.getMarcha());
        System.out.println("Velocidade:"+this.getVelocidade());

    }

    public void verificarMarcha() {

        switch (marcha) {

            case '1':

                System.out.println("O carro est� na primeira marcha");

                break;

            case '2':

                System.out.println("O carro est� na segunda marcha");

                break;

            case '3':
                System.out.println("O carro esta na terceira marcha");
                break;

            case '4':
                System.out.println("O carro esta na quarta marcha");
                break;

            case 'r':
                System.out.println("O carro est� na r�, sensor de estacionamento ativado");
                break;

            case 'n':
                System.out.println ("O carro ta normal");

            default:
                System.out.println ("Marcha incorreta!");
                break;
        }
    }
   }
   

   

