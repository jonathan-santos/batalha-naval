import javax.swing.*;

public class Batalha_Naval_2 
{
	/*Alunos:
	 Jonathan Augusto dos Santos, Nº 21
	 Vanessa Moura, Nº 34
	 Washington Martins Gomes, Nº 38
	 Wesley Geraldo Freire, N º39
	*/
	public static void main(String args[])
	{
		//Matriz Mapa
		int i=0, j=0;
		String matriz[][] = new String [11][11];
		matriz[0][0]="    ";
		matriz[0][1]=" a ";
		matriz[0][2]=" b ";
		matriz[0][3]=" c ";
		matriz[0][4]=" d ";
		matriz[0][5]=" e ";
		matriz[0][6]=" f ";
		matriz[0][7]=" g ";
		matriz[0][8]=" h ";
		matriz[0][9]=" i ";
		matriz[0][10]=" j ";
		for(i=0;i<11;i++)
		{
			for(j=1;j<11;j++)
			{
				if(i==0){ matriz[j][0]= String.valueOf(j); }
				else{ matriz[i][j]="Agua   ";}
			}
		}
		matriz[1][1]="Tiro     ";
		matriz[5][5]="Acerto";
		JOptionPane.showMessageDialog(null,"                                                                  Batalha Naval\n"+
				matriz[0][0]+"  | "+matriz[0][1]+"          | "+matriz[0][2]+"         | "+matriz[0][3]+"         | "+matriz[0][4]+"         | "+matriz[0][5]+"          | "+matriz[0][6]+"          | "+matriz[0][7]+"          | "+matriz[0][8]+"         | "+matriz[0][9]+"          | "+matriz[0][10]+"           |\n"+
				matriz[1][0]+"    | "+matriz[1][1]+" | "+matriz[1][2]+" | "+matriz[1][3]+" | "+matriz[1][4]+" | "+matriz[1][5]+" | "+matriz[1][6]+" | "+matriz[1][7]+" | "+matriz[1][8]+" | "+matriz[1][9]+" | "+matriz[1][10]+" |\n"+
				matriz[2][0]+"    | "+matriz[2][1]+" | "+matriz[2][2]+" | "+matriz[2][3]+" | "+matriz[2][4]+" | "+matriz[2][5]+" | "+matriz[2][6]+" | "+matriz[2][7]+" | "+matriz[2][8]+" | "+matriz[2][9]+" | "+matriz[2][10]+" |\n"+
				matriz[3][0]+"    | "+matriz[3][1]+" | "+matriz[3][2]+" | "+matriz[3][3]+" | "+matriz[3][4]+" | "+matriz[3][5]+" | "+matriz[3][6]+" | "+matriz[3][7]+" | "+matriz[3][8]+" | "+matriz[3][9]+" | "+matriz[3][10]+" |\n"+
				matriz[4][0]+"    | "+matriz[4][1]+" | "+matriz[4][2]+" | "+matriz[4][3]+" | "+matriz[4][4]+" | "+matriz[4][5]+" | "+matriz[4][6]+" | "+matriz[4][7]+" | "+matriz[4][8]+" | "+matriz[4][9]+" | "+matriz[4][10]+" |\n"+
				matriz[5][0]+"    | "+matriz[5][1]+" | "+matriz[5][2]+" | "+matriz[5][3]+" | "+matriz[5][4]+" | "+matriz[5][5]+" | "+matriz[5][6]+" | "+matriz[5][7]+" | "+matriz[5][8]+" | "+matriz[5][9]+" | "+matriz[5][10]+" |\n"+
				matriz[6][0]+"    | "+matriz[6][1]+" | "+matriz[6][2]+" | "+matriz[6][3]+" | "+matriz[6][4]+" | "+matriz[6][5]+" | "+matriz[6][6]+" | "+matriz[6][7]+" | "+matriz[6][8]+" | "+matriz[6][9]+" | "+matriz[6][10]+" |\n"+
				matriz[7][0]+"    | "+matriz[7][1]+" | "+matriz[7][2]+" | "+matriz[7][3]+" | "+matriz[7][4]+" | "+matriz[7][5]+" | "+matriz[7][6]+" | "+matriz[7][7]+" | "+matriz[7][8]+" | "+matriz[7][9]+" | "+matriz[7][10]+" |\n"+
				matriz[8][0]+"    | "+matriz[8][1]+" | "+matriz[8][2]+" | "+matriz[8][3]+" | "+matriz[8][4]+" | "+matriz[8][5]+" | "+matriz[8][6]+" | "+matriz[8][7]+" | "+matriz[8][8]+" | "+matriz[8][9]+" | "+matriz[8][10]+" |\n"+
				matriz[9][0]+"    | "+matriz[9][1]+" | "+matriz[9][2]+" | "+matriz[9][3]+" | "+matriz[9][4]+" | "+matriz[9][5]+" | "+matriz[9][6]+" | "+matriz[9][7]+" | "+matriz[9][8]+" | "+matriz[9][9]+" | "+matriz[9][10]+" |\n"+
				matriz[10][0]+"  | "+matriz[10][1]+" | "+matriz[10][2]+" | "+matriz[10][3]+" | "+matriz[10][4]+" | "+matriz[10][5]+" | "+matriz[10][6]+" | "+matriz[10][7]+" | "+matriz[10][8]+" | "+matriz[10][9]+" | "+matriz[10][10]+" |\n");
		
//=====================================================================================================================================================================================================
		//Navio1
			int Navio1_Linhas = 0, Navio1_Colunas = 0, Navio1_LinhaI=0, Navio1_LinhaF=0, Navio1_LinhaM=0, Navio1_ColunaI = 0, Navio1_ColunaF = 0, Navio1_ColunaM = 0;
			JOptionPane.showMessageDialog(null, "Jogador 1 cadastre as posicoes do primeiro navio que ocupara 3 casas \n O navio nao pode ser cadastrado em uma posicao diagonal");
			do{
			
				//Linhas------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 		do{
		 			
		 			//Linha Inicial
		 			do{
		 				Navio1_LinhaI = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 , Digite a linha Inicial da posicao do primeiro navio que sao numeros de 1 a 10 \n Lembre-se de que o primeiro navio deve ocupar 3 casas"));
		 			}while((Navio1_LinhaI>10)||(Navio1_LinhaI<1));
		 			
		 			//Linha Final
		 			do{
		 				Navio1_LinhaF = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 , Digite a linha Final da posicao do primeiro navio que sao numeros de 1 a 10 \n Lembre-se de que o primeiro navio deve ocupar 3 casas"));
		 			}while((Navio1_LinhaF>10)||(Navio1_LinhaF<1));
		 			
		 			//Meio
		 			if((Navio1_LinhaI + 2) == Navio1_LinhaF){ Navio1_LinhaM = Navio1_LinhaI + 1;}
		 			else if((Navio1_LinhaI - 2) == Navio1_LinhaF){ Navio1_LinhaM = Navio1_LinhaI - 1;}
		 			else if(Navio1_LinhaI==Navio1_LinhaF){ Navio1_LinhaM = Navio1_LinhaI; }
		 			
		 			//Linhas
		 			if(((Navio1_LinhaM + 1)== Navio1_LinhaF)&&((Navio1_LinhaM - 1)==Navio1_LinhaI)){Navio1_Linhas = 3;}
		 			else if(((Navio1_LinhaM - 1)== Navio1_LinhaF)&&((Navio1_LinhaM + 1)==Navio1_LinhaI)){Navio1_Linhas = 3;}
		 			else if(Navio1_LinhaI==Navio1_LinhaF){Navio1_Linhas=0;}
		 			else{ Navio1_Linhas = 1; }
		 			
		 			//Notificação de erro
		 			if(Navio1_Linhas == 1)
		 			{
		 				JOptionPane.showMessageDialog(null, "voce colocou alguma informação errada \n Tente de novo");
		 			}
		 		}while(Navio1_Linhas == 1);
		 			
	 		 	//Colunas------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	 		 	do{
	 		 		//Coluna Inicial
	 		 		do{
		 		 		String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna inicial do Navio que sao letras de A ate J, minusculas \n Lembre-se de que o primeiro navio deve ocupar 3 casas \na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
		 				if(Coluna.equals("a")){Navio1_ColunaI=1;}
		 				else if(Coluna.equals("b")){Navio1_ColunaI=2;}
		 				else if(Coluna.equals("c")){Navio1_ColunaI=3;}
		 				else if(Coluna.equals("d")){Navio1_ColunaI=4;}
		 				else if(Coluna.equals("e")){Navio1_ColunaI=5;}
		 				else if(Coluna.equals("f")){Navio1_ColunaI=6;}
		 				else if(Coluna.equals("g")){Navio1_ColunaI=7;}
		 				else if(Coluna.equals("h")){Navio1_ColunaI=8;}
		 				else if(Coluna.equals("i")){Navio1_ColunaI=9;}
		 				else if(Coluna.equals("j")){Navio1_ColunaI=10;}
		 				else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
		 			}while(Navio1_ColunaI<1);
		 			
	 		 		//Coluna FInal
		 			do{
		 				String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna inicial do Navio que sao letras de A ate J, minusculas \n Lembre-se de que o primeiro navio deve ocupar 3 casas\na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
		 				if(Coluna.equals("a")){Navio1_ColunaF=1;}
		 				else if(Coluna.equals("b")){Navio1_ColunaF=2;}
		 				else if(Coluna.equals("c")){Navio1_ColunaF=3;}
		 				else if(Coluna.equals("d")){Navio1_ColunaF=4;}
		 				else if(Coluna.equals("e")){Navio1_ColunaF=5;}
		 				else if(Coluna.equals("f")){Navio1_ColunaF=6;}
		 				else if(Coluna.equals("g")){Navio1_ColunaF=7;}
		 				else if(Coluna.equals("h")){Navio1_ColunaF=8;}
		 				else if(Coluna.equals("i")){Navio1_ColunaF=9;}
		 				else if(Coluna.equals("j")){Navio1_ColunaF=10;}
		 				else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
		 			}while(Navio1_ColunaF<1);
		 			
		 		 	//Meio--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	 			
		 			if(Navio1_Linhas == 0)
		 			{
			 		 	if(Navio1_ColunaI < Navio1_ColunaF){ Navio1_ColunaM = Navio1_ColunaF - 1; }
			 		 	else if(Navio1_ColunaI > Navio1_ColunaF) { Navio1_ColunaM = Navio1_ColunaF + 1; }
		 			}
					else if(Navio1_Linhas == 3){
						Navio1_ColunaM = Navio1_ColunaI;
					}
		 			
		 			//Colunas
		 			if(((Navio1_ColunaM + 1)== Navio1_ColunaF)&&((Navio1_ColunaM - 1)==Navio1_ColunaI))
		 			{
		 				Navio1_Colunas = 3;
		 			}
		 			else if(((Navio1_ColunaM - 1)== Navio1_ColunaF)&&((Navio1_ColunaM + 1)==Navio1_ColunaI))
					{
		 				Navio1_Colunas = 3;
					}
		 			else if(Navio1_ColunaI==Navio1_ColunaF)
		 			{
		 				Navio1_Colunas=0; 
		 			}
		 			else{ Navio1_Colunas = 1; }
		 			
		 			//Notificação de erro
		 			if(Navio1_Colunas == 1)
		 			{
		 				JOptionPane.showMessageDialog(null, "voce colocou alguma informaçãoo errada \n Tente de novo");
		 			}
		 			
	 		 	}while(Navio1_Colunas == 1);
	 		 	if(Navio1_Colunas == Navio1_Linhas){JOptionPane.showMessageDialog(null, "O numero de casas nao bate com o desejado \n Tente de novo"); }
			}while((Navio1_Colunas == Navio1_Linhas));
			 
			 
		//Navio2
		int Navio2_Linhas = 0, Navio2_Colunas = 0, Navio2_LinhaI = 0, Navio2_LinhaF = 0, Navio2_ColunaI = 0, Navio2_ColunaF = 0;
		JOptionPane.showMessageDialog(null, "Jogador 1 cadastre as posicoes do segundo navio que ocupara 2 casas \n Lembre-se de que nao podem ser diagonais");
		do{
			//Linhas------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			do{
				//Linha Inicial
				do{
					Navio2_LinhaI = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 , Digite a linha inicial do segundo navio que sao numeros de 1 a 10 minusculas \n Lembre-se de que o segundo navio deve ocupar 2 casas"));
				}while((Navio2_LinhaI>10)&&(Navio2_LinhaI<1));//&&(Navio2_LinhaI != Navio1_LinhaI)&&(Navio2_LinhaI != Navio1_LinhaF)&&(Navio2_LinhaI != Navio1_LinhaM));
				
				//Linha Final
				do{
					Navio2_LinhaF = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 , Digite a linha final do segundo navio que sao numeros de 1 a 10 minusculas \n Lembre-se de que o segundo navio deve ocupar 2 casas"));
				}while((Navio2_LinhaF>10)&&(Navio2_LinhaF<1));//&&(Navio2_LinhaF != Navio1_LinhaI)&&(Navio2_LinhaF != Navio1_LinhaF)&&(Navio2_LinhaF != Navio1_LinhaM));
				
				//Linhas
				if((Navio2_LinhaI + 1)==Navio2_LinhaF){ Navio2_Linhas = 2; }
				else if((Navio2_LinhaI - 1)==Navio2_LinhaF){ Navio2_Linhas = 2;}
				else if(Navio2_LinhaI == Navio2_LinhaF){ Navio2_Linhas = 0; }
				else{ Navio2_Linhas = 1; }
				
			}while(Navio2_Linhas==1);
			//Colunas------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			do{
				//Coluna Inicial
				do{
					String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna inicial do segundo Navio que sao letras de A ate J, minusculas \n Lembre-se de que o segundo navio deve ocupar 2 casas\na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
					if(Coluna.equals("a")){Navio2_ColunaI=1;}
					else if(Coluna.equals("b")){Navio2_ColunaI=2;}
					else if(Coluna.equals("c")){Navio2_ColunaI=3;}
					else if(Coluna.equals("d")){Navio2_ColunaI=4;}
					else if(Coluna.equals("e")){Navio2_ColunaI=5;}
					else if(Coluna.equals("f")){Navio2_ColunaI=6;}
					else if(Coluna.equals("g")){Navio2_ColunaI=7;}
					else if(Coluna.equals("h")){Navio2_ColunaI=8;}
					else if(Coluna.equals("i")){Navio2_ColunaI=9;}
					else if(Coluna.equals("j")){Navio2_ColunaI=10;}
					else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
				}while((Navio2_ColunaI<1));
				//Coluna Final
				do{
					String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna final segundo do Navio que sao letras de A ate J, minusculas \n Lembre-se de que o segundo navio deve ocupar 2 casas \na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
					if(Coluna.equals("a")){Navio2_ColunaF=1;}
					else if(Coluna.equals("b")){Navio2_ColunaF=2;}
					else if(Coluna.equals("c")){Navio2_ColunaF=3;}
					else if(Coluna.equals("d")){Navio2_ColunaF=4;}
					else if(Coluna.equals("e")){Navio2_ColunaF=5;}
					else if(Coluna.equals("f")){Navio2_ColunaF=6;}
					else if(Coluna.equals("g")){Navio2_ColunaF=7;}
					else if(Coluna.equals("h")){Navio2_ColunaF=8;}
					else if(Coluna.equals("i")){Navio2_ColunaF=9;}
					else if(Coluna.equals("j")){Navio2_ColunaF=10;}
					else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
				}while((Navio2_ColunaF<1));
				
				//Colunas
				if((Navio2_ColunaI + 1)==Navio2_ColunaF){ Navio2_Colunas = 2; }
				else if((Navio2_ColunaI - 1)==Navio2_ColunaF){ Navio2_Colunas = 2;}
				else if(Navio2_ColunaI == Navio2_ColunaF){ Navio2_Colunas = 0; }
				else{ Navio2_Colunas = 1; }
				
				
			}while(Navio2_Colunas == 1);	
			
			//Erros e repetições de barcos
			if(Navio2_Colunas == Navio2_Linhas){ JOptionPane.showMessageDialog(null, "O numero de casas nao bate com o desejado \n Tente de novo"); }
			
			//Navio2_LinhaI e Navio2_ColunaI
			else if((Navio2_LinhaI == Navio1_LinhaI)&&(Navio2_ColunaI==Navio1_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 2 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio2_Linhas = 1;
				Navio2_Colunas = 1;
			}else if((Navio2_LinhaI == Navio1_LinhaM)&&(Navio2_ColunaI==Navio1_ColunaM)){
				JOptionPane.showMessageDialog(null, "O Navio 2 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio2_Linhas = 1;
				Navio2_Colunas = 1;
			}else if((Navio2_LinhaI == Navio1_LinhaF)&&(Navio2_ColunaI==Navio1_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 2 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio2_Linhas = 1;
				Navio2_Colunas = 1;
				
			//Navio2_LinhaF e Navio2_ColunaF	
			}else if((Navio2_LinhaF == Navio1_LinhaI)&&(Navio2_ColunaF==Navio1_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 2 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio2_Linhas = 1;
				Navio2_Colunas = 1;
			}else if((Navio2_LinhaF == Navio1_LinhaM)&&(Navio2_ColunaF==Navio1_ColunaM)){
				JOptionPane.showMessageDialog(null, "O Navio 2 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio2_Linhas = 1;
				Navio2_Colunas = 1;
			}else if((Navio2_LinhaF == Navio1_LinhaF)&&(Navio2_ColunaF==Navio1_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 2 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio2_Linhas = 1;
				Navio2_Colunas = 1;
			}
	 		 	
	  	}while(Navio2_Linhas == Navio2_Colunas);
			
		//Navio3
		//Inicial------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JOptionPane.showMessageDialog(null, "Jogador 1 cadastre as posicoes do terceiro navio que ocupara 4 casas \n Lembre-se de que nao podem ser diagonais");
		int Navio3_Linhas = 0, Navio3_Colunas = 0, Navio3_LinhaI = 0, Navio3_LinhaF = 0, Navio3_ColunaI = 0, Navio3_ColunaF = 0, Navio3_LinhaM1 = 0, Navio3_LinhaM2 = 0, Navio3_ColunaM1 = 0, Navio3_ColunaM2 = 0; 
		do{
			//Linhas------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			do{
				//Linha Inicial
				do{
					Navio3_LinhaI = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 , Digite a linha inicial da primeiro posicao do terceiro navio que sao numeros de 1 a 10"));
				}while((Navio3_LinhaI>10)&&(Navio3_LinhaI<1));
				
				//Linha Final
				do{
					Navio3_LinhaF = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 , Digite a linha final da segundo posicao do terceiro navio que sao numeros de 1 a 10"));
				}while((Navio3_LinhaF>10)&&(Navio3_LinhaF<1));
				
				//Meio
		 		if((Navio3_LinhaI + 3) == Navio3_LinhaF)
		 		{
		 			Navio3_LinhaM1 = Navio3_LinhaI + 1;
		 			Navio3_LinhaM2 = Navio3_LinhaI + 2;
		 		}
		 		else if((Navio3_LinhaI - 3) == Navio3_LinhaF)
		 		{ 
		 			Navio3_LinhaM1 = Navio3_LinhaI - 1;
		 			Navio3_LinhaM2 = Navio3_LinhaI - 2;
		 		}
		 		else if(Navio3_LinhaI==Navio3_LinhaF)
		 		{
		 			Navio3_LinhaM1 = Navio3_LinhaI;
		 			Navio3_LinhaM2 = Navio3_LinhaI;
		 		}
				
	 			//Linhas
	 			if(((Navio3_LinhaM1 - 1)== Navio3_LinhaI)&&((Navio3_LinhaM2 + 1)==Navio3_LinhaF))
	 			{
	 				Navio3_Linhas = 4;
	 			}
	 			else if(((Navio3_LinhaM1 + 1)== Navio3_LinhaF)&&((Navio3_LinhaM2 - 1)==Navio3_LinhaI))
				{
	 				Navio3_Linhas = 4;
				}
	 			else if(Navio3_LinhaI==Navio3_LinhaF)
	 			{
	 				Navio3_Linhas=0; 
	 			}
	 			else{ Navio3_Linhas = 1; }
				
				//Notificação de erro
	 			if(Navio3_Linhas == 1)
	 			{
	 				JOptionPane.showMessageDialog(null, "voce colocou alguma informação errada \n Tente de novo");
	 			}
				
			}while(Navio3_Linhas==1);
			
			//Colunas------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			do{
				//Coluna Inicial
				do{
					String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna inicial do terceiro Navio que sao letras de A ate J\na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
					if(Coluna.equals("a")){Navio3_ColunaI=1;}
					else if(Coluna.equals("b")){Navio3_ColunaI=2;}
					else if(Coluna.equals("c")){Navio3_ColunaI=3;}
					else if(Coluna.equals("d")){Navio3_ColunaI=4;}
					else if(Coluna.equals("e")){Navio3_ColunaI=5;}
					else if(Coluna.equals("f")){Navio3_ColunaI=6;}
					else if(Coluna.equals("g")){Navio3_ColunaI=7;}
					else if(Coluna.equals("h")){Navio3_ColunaI=8;}
					else if(Coluna.equals("i")){Navio3_ColunaI=9;}
					else if(Coluna.equals("j")){Navio3_ColunaI=10;}
					else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
				}while((Navio3_ColunaI<1));
			
				//Coluna Final
				do{
					String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna final do terceiro Navio que sao letras de A ate J\na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
					if(Coluna.equals("a")){Navio3_ColunaF=1;}
					else if(Coluna.equals("b")){Navio3_ColunaF=2;}
					else if(Coluna.equals("c")){Navio3_ColunaF=3;}
					else if(Coluna.equals("d")){Navio3_ColunaF=4;}
					else if(Coluna.equals("e")){Navio3_ColunaF=5;}
					else if(Coluna.equals("f")){Navio3_ColunaF=6;}
					else if(Coluna.equals("g")){Navio3_ColunaF=7;}
					else if(Coluna.equals("h")){Navio3_ColunaF=8;}
					else if(Coluna.equals("i")){Navio3_ColunaF=9;}
					else if(Coluna.equals("j")){Navio3_ColunaF=10;}
					else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
				}while((Navio3_ColunaF<1));
				
				//Meio
				if(Navio3_Linhas == 0)
				{
			 		if((Navio3_ColunaI + 3) == Navio3_ColunaF)
			 		{
			 			Navio3_ColunaM1 = Navio3_ColunaI + 1;
			 			Navio3_ColunaM2 = Navio3_ColunaI + 2;
			 		}
			 		else if((Navio3_ColunaI - 3) == Navio3_ColunaF)
			 		{ 
			 			Navio3_ColunaM1 = Navio3_ColunaI - 1;
			 			Navio3_ColunaM2 = Navio3_ColunaI - 2;
			 		}
				}
				else if(Navio3_Linhas == 4){
					Navio3_ColunaM1 = Navio3_ColunaI;
					Navio3_ColunaM2 = Navio3_ColunaI;
				}
				
				//Colunas
	 			if(((Navio3_ColunaM1 - 1)== Navio3_ColunaI)&&((Navio3_ColunaM2 + 1)==Navio3_ColunaF))
	 			{
	 				Navio3_Colunas = 4;
	 			}
	 			else if(((Navio3_ColunaM1 + 1)== Navio3_ColunaF)&&((Navio3_ColunaM2 - 1)==Navio3_ColunaI))
				{
	 				Navio3_Colunas = 4;
				}
	 			else if(Navio3_ColunaI==Navio3_ColunaF)
	 			{
	 				Navio3_Colunas=0; 
	 			}
	 			else{ Navio3_Linhas = 1; }
				
				//Notificação de erro
	 			if(Navio3_Colunas == 1)
	 			{
	 				JOptionPane.showMessageDialog(null, "voce colocou alguma informação errada \n Tente de novo");
	 			}
	 			
			}while(Navio3_Colunas == 1);
			
			//Erros e repetições de barcos
			if(Navio3_Colunas == Navio3_Linhas){ JOptionPane.showMessageDialog(null, "O numero de casas nao bate com o desejado \n Tente de novo"); }
			
			//Navio3_LinhaI e Navio3_ColunaI
			else if((Navio3_LinhaI == Navio1_LinhaI)&&(Navio3_ColunaI==Navio1_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaI == Navio1_LinhaM)&&(Navio3_ColunaI==Navio1_ColunaM)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaI == Navio1_LinhaF)&&(Navio3_ColunaI==Navio1_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaI == Navio2_LinhaI)&&(Navio3_ColunaI==Navio2_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaI == Navio2_LinhaF)&&(Navio3_ColunaI==Navio2_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}				
			
			//Navio3_LinhaM1 e Navio3_ColunaM1
			else if((Navio3_LinhaM1 == Navio1_LinhaI)&&(Navio3_ColunaM1==Navio1_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM1 == Navio1_LinhaM)&&(Navio3_ColunaM1==Navio1_ColunaM)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM1 == Navio1_LinhaF)&&(Navio3_ColunaM1==Navio1_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM1 == Navio2_LinhaI)&&(Navio3_ColunaM1==Navio2_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM1 == Navio2_LinhaF)&&(Navio3_ColunaM1==Navio2_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}		
			
			//Navio3_LinhaM2 e Navio3_ColunaM2
			else if((Navio3_LinhaM2== Navio1_LinhaI)&&(Navio3_ColunaM2==Navio1_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM2 == Navio1_LinhaM)&&(Navio3_ColunaM2==Navio1_ColunaM)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM2 == Navio1_LinhaF)&&(Navio3_ColunaM2==Navio1_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM2 == Navio2_LinhaI)&&(Navio3_ColunaM2==Navio2_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaM2 == Navio2_LinhaF)&&(Navio3_ColunaM2==Navio2_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}	
			
			//Navio3_LinhaF e Navio3_ColunaF
			else if((Navio3_LinhaF == Navio1_LinhaI)&&(Navio3_ColunaF==Navio1_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaF == Navio1_LinhaM)&&(Navio3_ColunaF==Navio1_ColunaM)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaF == Navio1_LinhaF)&&(Navio3_ColunaF==Navio1_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 1 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaF == Navio2_LinhaI)&&(Navio3_ColunaF==Navio2_ColunaI)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}else if((Navio3_LinhaF == Navio2_LinhaF)&&(Navio3_ColunaF==Navio2_ColunaF)){
				JOptionPane.showMessageDialog(null, "O Navio 3 está no mesmo local que o Navio 2 \n Tente de novo e nao os coloque na mesma posicao de novo");
				Navio3_Linhas = 1;
				Navio3_Colunas = 1;
			}		
		}while((Navio3_Colunas == Navio3_Linhas));		
	
//====================================================================================================================================================================================================				
		//Jogo
			boolean Navio1 = true, Navio2 = true, Navio3 = true;
		do{			
			//Tiro
			int Tiro_Linha=0;
			int Tiro_Coluna =0;			
				JOptionPane.showMessageDialog(null, "Jogador 2 cadastre as posicoes do seu tiro");
				//Tiro Linha
				do{
					Tiro_Linha = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 , Digite a linha do tiro que sao numeros de 1 a 10"));
				}while((Tiro_Linha>10)&&(Tiro_Linha<1));
				//Tiro Coluna
				do{
					String Coluna = JOptionPane.showInputDialog("Jogador 1 , Digite a coluna do Tiro que sao letras de A ate J\na=1\nb=2\nc=3\nd=4\ne=5\nf=6\ng=7\nh=8\ni=9\nj=10");
					if(Coluna.equals("a")){Tiro_Coluna=1;}
					else if(Coluna.equals("b")){Tiro_Coluna=2;}
					else if(Coluna.equals("c")){Tiro_Coluna=3;}
					else if(Coluna.equals("d")){Tiro_Coluna=4;}
					else if(Coluna.equals("e")){Tiro_Coluna=5;}
					else if(Coluna.equals("f")){Tiro_Coluna=6;}
					else if(Coluna.equals("g")){Tiro_Coluna=7;}
					else if(Coluna.equals("h")){Tiro_Coluna=8;}
					else if(Coluna.equals("i")){Tiro_Coluna=9;}
					else if(Coluna.equals("j")){Tiro_Coluna=10;}
					else{ JOptionPane.showMessageDialog(null, "voce digitou um valor invalido, tente de novo");}
				}while(Tiro_Coluna<1);
				
				//Alteração do mapa e jogo
				
					//Tiro
						matriz[Tiro_Linha][Tiro_Coluna]="Tiro     ";
						
					//Destruição dos Navios
						//Navio1
						if(matriz[Navio1_LinhaI][Navio1_ColunaI]=="Tiro     "){Navio1 = false;}
						else if(matriz[Navio1_LinhaM][Navio1_ColunaM]=="Tiro     "){Navio1=false;}
						else if(matriz[Navio1_LinhaF][Navio1_ColunaF]=="Tiro     "){Navio1 = false;}
						//Navio2
						if(matriz[Navio2_LinhaI][Navio2_ColunaI]=="Tiro     "){Navio2 = false;}
						else if(matriz[Navio2_LinhaF][Navio2_ColunaF]=="Tiro     "){Navio2=false;}
						//Navio3
						if(matriz[Navio3_LinhaI][Navio3_ColunaI]=="Tiro     "){Navio3 = false;}
						else if(matriz[Navio3_LinhaM1][Navio3_ColunaM1]=="Tiro     "){Navio3=false;}
						else if(matriz[Navio3_LinhaM2][Navio3_ColunaM2]=="Tiro     "){Navio3=false;}
						else if(matriz[Navio3_LinhaF][Navio3_ColunaF]=="Tiro     "){Navio3 = false;}
					
						
					//Navios - Aviso e afundar
						if(Navio1==false){
							JOptionPane.showMessageDialog(null, "parabens jogador 2, voce acertou o primeiro Navio!");
							matriz[Navio1_LinhaI][Navio1_ColunaI]="Acerto";
							matriz[Navio1_LinhaM][Navio1_ColunaM]="Acerto";
							matriz[Navio1_LinhaF][Navio1_ColunaF]="Acerto";
						}
						else if(Navio2==false){
							JOptionPane.showMessageDialog(null, "parabens jogador 2, voce acertou o segundo Navio!");
							matriz[Navio2_LinhaI][Navio2_ColunaI]="Acerto";
							matriz[Navio2_LinhaF][Navio2_ColunaF]="Acerto";
						}
						else if(Navio3==false){
							JOptionPane.showMessageDialog(null, "parabens jogador 2, voce acertou o terceiro Navio!");
							matriz[Navio3_LinhaI][Navio3_ColunaI]="Acerto";
							matriz[Navio3_LinhaM1][Navio3_ColunaM1]="Acerto";
							matriz[Navio3_LinhaM2][Navio3_ColunaM2]="Acerto";
							matriz[Navio3_LinhaF][Navio3_ColunaF]="Acerto";
						}
				
				JOptionPane.showMessageDialog(null,"                                                                  Batalha Naval\n"+
						matriz[0][0]+"  | "+matriz[0][1]+"          | "+matriz[0][2]+"         | "+matriz[0][3]+"         | "+matriz[0][4]+"         | "+matriz[0][5]+"          | "+matriz[0][6]+"          | "+matriz[0][7]+"          | "+matriz[0][8]+"         | "+matriz[0][9]+"          | "+matriz[0][10]+"           |\n"+
						matriz[1][0]+"    | "+matriz[1][1]+" | "+matriz[1][2]+" | "+matriz[1][3]+" | "+matriz[1][4]+" | "+matriz[1][5]+" | "+matriz[1][6]+" | "+matriz[1][7]+" | "+matriz[1][8]+" | "+matriz[1][9]+" | "+matriz[1][10]+" |\n"+
						matriz[2][0]+"    | "+matriz[2][1]+" | "+matriz[2][2]+" | "+matriz[2][3]+" | "+matriz[2][4]+" | "+matriz[2][5]+" | "+matriz[2][6]+" | "+matriz[2][7]+" | "+matriz[2][8]+" | "+matriz[2][9]+" | "+matriz[2][10]+" |\n"+
						matriz[3][0]+"    | "+matriz[3][1]+" | "+matriz[3][2]+" | "+matriz[3][3]+" | "+matriz[3][4]+" | "+matriz[3][5]+" | "+matriz[3][6]+" | "+matriz[3][7]+" | "+matriz[3][8]+" | "+matriz[3][9]+" | "+matriz[3][10]+" |\n"+
						matriz[4][0]+"    | "+matriz[4][1]+" | "+matriz[4][2]+" | "+matriz[4][3]+" | "+matriz[4][4]+" | "+matriz[4][5]+" | "+matriz[4][6]+" | "+matriz[4][7]+" | "+matriz[4][8]+" | "+matriz[4][9]+" | "+matriz[4][10]+" |\n"+
						matriz[5][0]+"    | "+matriz[5][1]+" | "+matriz[5][2]+" | "+matriz[5][3]+" | "+matriz[5][4]+" | "+matriz[5][5]+" | "+matriz[5][6]+" | "+matriz[5][7]+" | "+matriz[5][8]+" | "+matriz[5][9]+" | "+matriz[5][10]+" |\n"+
						matriz[6][0]+"    | "+matriz[6][1]+" | "+matriz[6][2]+" | "+matriz[6][3]+" | "+matriz[6][4]+" | "+matriz[6][5]+" | "+matriz[6][6]+" | "+matriz[6][7]+" | "+matriz[6][8]+" | "+matriz[6][9]+" | "+matriz[6][10]+" |\n"+
						matriz[7][0]+"    | "+matriz[7][1]+" | "+matriz[7][2]+" | "+matriz[7][3]+" | "+matriz[7][4]+" | "+matriz[7][5]+" | "+matriz[7][6]+" | "+matriz[7][7]+" | "+matriz[7][8]+" | "+matriz[7][9]+" | "+matriz[7][10]+" |\n"+
						matriz[8][0]+"    | "+matriz[8][1]+" | "+matriz[8][2]+" | "+matriz[8][3]+" | "+matriz[8][4]+" | "+matriz[8][5]+" | "+matriz[8][6]+" | "+matriz[8][7]+" | "+matriz[8][8]+" | "+matriz[8][9]+" | "+matriz[8][10]+" |\n"+
						matriz[9][0]+"    | "+matriz[9][1]+" | "+matriz[9][2]+" | "+matriz[9][3]+" | "+matriz[9][4]+" | "+matriz[9][5]+" | "+matriz[9][6]+" | "+matriz[9][7]+" | "+matriz[9][8]+" | "+matriz[9][9]+" | "+matriz[9][10]+" |\n"+
						matriz[10][0]+"  | "+matriz[10][1]+" | "+matriz[10][2]+" | "+matriz[10][3]+" | "+matriz[10][4]+" | "+matriz[10][5]+" | "+matriz[10][6]+" | "+matriz[10][7]+" | "+matriz[10][8]+" | "+matriz[10][9]+" | "+matriz[10][10]+" |\n");
				
				JOptionPane.showMessageDialog(null, "voce efetuou uma jogada!");

		}while((Navio1==true)||(Navio2==true)||(Navio3==true)); 	
		JOptionPane.showMessageDialog(null, "parabens jogador 2, voce destruiu todos os navios colocados pelo jogador 1 e venceu o jogo!");
		
	}
}