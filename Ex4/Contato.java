package Abstracao.Ex4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public  abstract class Contato {

        private String apelido;
        private String nome;
        private String email;
        private Date aniversario;


        public Contato(String apelido, String nome, String email, Date aniversario) {
                this.apelido = apelido;
                this.nome = nome;
                this.email = email;
                this.aniversario = aniversario;
        }

        protected String GetFormatedBirthDay(){
                Locale locale = new Locale("pt", "br");
                DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
               return dateFormat.format(this.aniversario);
        }

        public void ImprimirBasico(){

                System.out.println("Apelido: " + apelido);
                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("Aniversario: " + GetFormatedBirthDay());


        };

        public  abstract void ImprimirContato();




}
