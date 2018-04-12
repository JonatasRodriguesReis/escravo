import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.*;
import java.awt.*;

/* TUTORIAL

robot.mouseMove(78, 73);
leftClick();
leftHoldClick();
rigthClick();        
robot.delay(2000);
type("141414");

//Enter
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

//Double Click KICK
robot.mousePress  (InputEvent.BUTTON1_MASK);
robot.mouseRelease(InputEvent.BUTTON1_MASK);
robot.mousePress  (InputEvent.BUTTON1_MASK);
robot.mouseRelease(InputEvent.BUTTON1_MASK);

//Para puxar, usar essa combinação
robot.mouseMove(600, 206); DE ONDE
leftHoldClick();
robot.mouseMove(542, 899); PARA ONDE  
robot.mouseRelease(InputEvent.BUTTON1_MASK);


//Apaga um caractere AVÁ!
apagar();

*/


public class QCostSlave
{
  Robot robot = new Robot();

  public static void main(String[] args) throws Exception
  {
	new QCostSlave();  
  }
  
  public QCostSlave() throws Exception
  {
	  // Início do programa na página inicial New EP
	// Acesso ao New Plantopia começa no OLD LGE 2.0

	   robot.mouseMove(306, 624);
	   leftClick();
	   robot.delay(10000);

	// Selecionando o New Plantopia
	   
	   robot.mouseMove(455, 365);
	   leftClick();
	   robot.delay(15000);


	// Selecionando MIS Report
	   
	   robot.mouseMove(1077, 434);
	   leftClick();
	   robot.delay(10000);


	// Movendo do PSI até o Sales
	   
	   robot.mouseMove(537, 147);
	   robot.delay(1000);
	   robot.mouseMove(544, 194);
	   robot.delay(1000);
	   robot.mouseMove(345, 194);
	   leftClick();
	   robot.delay(1000);

	// Filtro de Dados
	// Movendo para o campo de data e digitando o início do mês

	   robot.mouseMove(332, 240);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.delay(1000);
	   type("20180101");
	   robot.delay(500);

	// Movendo para o campo de data e digitando o final do mês

	   robot.mouseMove(328, 255);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.delay(1000);
	   type("20180131");
	   robot.delay(500);

	// Selecionando a divisão

	   robot.mouseMove(338, 290);   
	   leftClick();
	   robot.delay(500);

	// Selecionando a caixa de SEARCH para procurar a divisão de MWO

	   robot.mouseMove(414, 324);
	   leftClick();
	   type("Cooking");
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   robot.delay(3000);
	   robot.mouseMove(346, 347);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   
	   

	// Selecionando a caixa de SEARCH para procurar a divisão de RAC

	   robot.mouseMove(414, 324);
	   leftClick();
	   type("RAC");
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   robot.delay(3000);
	   robot.mouseMove(340, 347);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mousePress  (InputEvent.BUTTON1_MASK);
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mouseMove(725, 547);
	   robot.delay(500);
	   leftClick();
	   robot.delay(500);


	// Selecionando a moeda USD

	   robot.mouseMove(316, 530);
	   robot.delay(500);
	   leftClick();   


	// Selecionando a opção Value

	   robot.mouseMove(329, 562);
	   robot.delay(500);
	   leftClick();   

	// Selecionando a opção Search

	   robot.mouseMove(314, 625);
	   robot.delay(500);
	   leftClick();   
	   robot.delay(30000);

	// Exportando os dados 
	// Export

	   robot.mouseMove(497, 200);
	   robot.delay(500);
	   leftClick();
	   robot.delay(10000);

	// Export   
	   
	   robot.mouseMove(1241, 352);
	   robot.delay(500);
	   leftClick();   
	   robot.delay(10000);
	   
	// Abrindo o arquivo

	   robot.mouseMove(956, 682);
	   robot.delay(500);
	   leftClick();   
	   robot.delay(15000);

	// Habilitando a edição do arquivo em Excel

	   robot.mouseMove(811, 63);
	   robot.delay(500);
	   leftClick();   
	   robot.delay(3000);

	// Editando o arquivo no Excel
	// Movendo para a linha 1, selecionar até a 5 e excluir as linhas

	   robot.mouseMove(9, 186); 
	   leftHoldClick();
	   robot.mouseMove(9, 257); 
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   rightClick();
	   robot.delay(1000);
	   robot.mouseMove(60, 408);
	   leftClick();
	   robot.delay(1000);

	// Inserindo uma tabela dinâmica

	   robot.mouseMove(58, 188);
	   leftClick();
	   robot.delay(1000);
	   robot.mouseMove(186, 32);
	   leftClick();
	   robot.delay(1000);
	   robot.mouseMove(32, 69);
	   leftClick();
	   robot.delay(1000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);

	// Selecionar tipo de tabela dinâmica

	   robot.mouseMove(109, 310);
	   rightClick();
	   robot.delay(500);
	   robot.mouseMove(206, 364);
	   leftClick();
	   robot.delay(500);
	   robot.mouseMove(227, 223);
	   leftClick();
	   robot.delay(1000);
	   robot.mouseMove(33, 374);
	   leftClick();
	   robot.delay(1000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);

	// Montando os campos do relatório na tabela dinâmica

	   robot.mouseMove(1186, 269); // Division
	   leftHoldClick();
	   robot.mouseMove(1181, 535);   
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);     
	   robot.mouseMove(1224, 231); // YYMMDD
	   leftHoldClick();
	   robot.mouseMove(1180, 628);   
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mouseMove(1183, 429); // NET Sales
	   leftHoldClick();
	   robot.mouseMove(1299, 634);   
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   robot.mouseMove(1229, 375); // Qty
	   leftHoldClick();
	   robot.mouseMove(1299, 634);   
	   robot.mouseRelease(InputEvent.BUTTON1_MASK);
	   
	// Filtrando dados de acordo com a Divisão

	   robot.mouseMove(280, 187); // Filtro de Divisão
	   leftHoldClick();
	   robot.delay(1000);
	   robot.mouseMove(58, 410); // Seleciona todos os itens
	   leftHoldClick();
	   robot.delay(1000);
	   robot.mouseMove(80, 232); // Desmarca as seleções
	   leftHoldClick();
	   robot.delay(1000);
	   robot.mouseMove(81, 264); // Seleciona o RAC
	   leftHoldClick();
	   robot.delay(1000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);

	   robot.mouseMove(280, 187); // Filtro de Divisão
	   leftHoldClick();
	   robot.delay(1000);
	   robot.mouseMove(81, 263); // Desmarca o RAC
	   leftHoldClick();
	   robot.delay(1000);
	   robot.mouseMove(81, 248); // Marca o MWO
	   leftHoldClick();
	   robot.delay(1000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);

	// Fim
  }
  
  private void leftClick()
  {
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(200);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.delay(200);
  }
  
  private void leftHoldClick()
  {
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(200);
  }
  
  private void rightClick()
  {
    robot.mousePress(InputEvent.BUTTON3_MASK);
    robot.delay(200);
	robot.mouseRelease(InputEvent.BUTTON3_MASK);
    robot.delay(200);
  }
  
  private void apagar()
  {
	robot.keyPress(KeyEvent.VK_BACK_SPACE);
	robot.delay(100);
	robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	robot.delay(100);
  }
  
  private void type(int i)
  {
    robot.delay(40);
    robot.keyPress(i);
    robot.keyRelease(i);
  }

  private void type(String s)
  {
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int code = b;
      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
      if (code > 96 && code < 123) code = code - 32;
      robot.delay(40);
      robot.keyPress(code);
      robot.keyRelease(code);
    }
  }
}