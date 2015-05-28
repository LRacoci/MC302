package pt.c02classes.s01knowledge.s02app.actors;

import java.util.Scanner;
import java.util.Stack;

import pt.c02classes.s01knowledge.s01base.inter.IEnquirer;
import pt.c02classes.s01knowledge.s01base.inter.IResponder;

public class Direction extends String{
	String[] movimentos = {"norte", "sul", "leste", "oeste"};
	public String revert(String in){
		switch(in){
			case "sul":return "norte";
			case "norte":return "sul";
			case "leste":return "oeste";
			case "oeste":return "leste";
		}
	}
	public String next(String in){

	}
}

public class Position {
	int x = 0;
	int y = 0;
	Move[] move = new Move[4];
	for(Move m : move) {
		m = new Move();
	}

}


public class EnquirerMaze implements IEnquirer {

  IResponder responder;
  /* Refazer para que ele descubra a saida automaticamente,
   * ele pergunta para o responder e movera o responder
   */
  public void connect(IResponder responder) {
		this.responder = responder;
  }

  public boolean discover() {
		Stack caminho = new Stack();
		String[] movimentos = {"norte", "sul", "leste", "oeste"};
		Boolean fim = false;

		do{

		}while (!fim && responder.ask("aqui").equals("saida"));

			for (String movimento : movimentos) {
				switch (responder.ask(movimento)){
					case"saida":
						fim = true;
					break;
					case"passagem": case"entrada":
						responder.move(movimento);
					break;
				}
				if(fim) break;
			}
		}

		if (responder.finalAnswer("cheguei"))
		  System.out.println("Você encontrou a saida!");
		else
		  System.out.println("Fuém fuém fuém!");

		/*scanner.close();*/

	return true;
  }

}
