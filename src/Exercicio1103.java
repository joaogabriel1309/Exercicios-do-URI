/*
Daniela é enfermeira em um grande hospital, e tem os horários de trabalho muito variáveis.
Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com relógios despertadores.

Recentemente ela ganhou de presente um relógio digital, com alarme com vários tons, e tem esperança que isso resolva o seu problema.
No entanto, ela anda muito cansada e quer aproveitar cada momento de descanso.
Por isso, carrega seu relógio digital despertador para todos os lugares, e sempre que tem um tempo de
descanso procura dormir, programando o alarme despertador para a hora em que tem que acordar.
No entanto, com tanta ansiedade para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.

Um problema que a tem atormentado na hora de dormir é saber quantos minutos ela teria de sono se adormecesse
imediatamente e acordasse somente quando o despertador tocasse. Mas ela realmente não é muito boa com números, e pediu
sua ajuda para escrever um programa que, dada a hora corrente e a hora do alarme, determine o número de minutos que ela
poderia dormir.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é descrito em uma linha, contendo quatro números
inteiros H  1 , M 1 , H2 e M 2, com H1:M1 representando a hora e minuto atuais, e H2:M2 representando a hora e minuto
para os quais o alarme  despertador foi programado (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).

O final da entrada é indicado por uma linha que contém apenas quatro zeros, separados por espaços em branco.
 */

import java.util.Scanner;

public class Exercicio1103 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (scr.hasNext()) {
            long Result = 0;

            int StartHours = scr.nextInt();
            int StartMinute = scr.nextInt();
            int FinalHours = scr.nextInt();
            int FinalMinute = scr.nextInt();

            if (!(StartHours == 0) ||
                !(StartMinute == 0) ||
                !(FinalHours == 0) ||
                !(FinalMinute == 0)){
                if ((FinalMinute > StartMinute) && (StartHours == FinalHours)) {
                    Result = FinalMinute - StartMinute;
                }else{
                    if ((StartMinute > FinalMinute) && (StartHours == FinalHours)){
                        Result = 1440 - (StartMinute - FinalMinute);
                    }else{
                        if (StartHours > FinalHours){
                            Result = (long) (StartHours - FinalHours) * 60;
                            Result = 1440 - Result;
                            if (StartMinute > FinalMinute){
                                Result = Result - (StartMinute - FinalMinute);
                            }else{
                                Result = Result + (FinalMinute - StartMinute);
                            }
                        }else{
                            Result = (long) (FinalHours - StartHours) * 60;
                            if (StartMinute > FinalMinute){
                                Result = Result - (StartMinute - FinalMinute);
                            }else{
                                Result = Result + (FinalMinute - StartMinute);
                            }
                        }
                    }
                }

            }
            System.out.println(Result);
        }
    }
}
