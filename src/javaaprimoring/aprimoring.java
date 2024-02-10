package javaaprimoring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;

public class aprimoring {
    public static void main(String[] args) throws ParseException {

        int num = 7;

        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

        seeBirthday();
    }

         static void seeBirthday() throws ParseException{
            String nome = "Caique";
            Date aniversario = new SimpleDateFormat("dd/MM/yyyy").parse("13/07/2004");

            if (aniversario.equals(java.sql.Date.valueOf(LocalDateTime.now().toLocalDate()))) {
                System.out.println("te amo" + nome + "parabéns");
            } else {
                System.out.println("sai fora" + " " + nome);
            }
        }
    }