package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*Visitante v1 = new Visitante();
      v1.setNome("Juvenal");
      v1.setIdade(23);
      v1.setSexo("M");
      System.out.printf(v1.toString());*/

      Aluno a1 = new Aluno();
      a1.setNome("Claudio");
      a1.setMatricula(1234);
      a1.setCurso("Informatica");
      a1.setIdade(17);
      a1.setSexo("M");
      a1.pagarMensalidade();


    }
}
