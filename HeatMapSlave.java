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


//Apaga um caractere 
apagar();

*/


public class HeatMapSlave
{
  Robot robot = new Robot();

  public static void main(String[] args) throws Exception
  {
	new HeatMapSlave();  
  }
  
  public HeatMapSlave() throws Exception
  {
	  robot.mouseMove(570, 0);
	  leftClick();

	  robot.mouseMove(144, 43);
	  doubleClick();
	  robot.delay(6000);

	  robot.mouseMove(251, 193);
	  leftClick();
	  robot.mouseMove(252, 147);
	  leftClick();
	  robot.delay(500);

	  inserirDataFormula("C1");

	  robot.mouseMove(252, 147);
	  leftClick();
	  
	  robot.delay(1000);
	  robot.mouseMove(280, 199);
	  doubleClick();

      /*robot.mouseMove(123, 180);
	  leftClick();*/

	  /*robot.delay(500);
	  rightClick();
	  robot.delay(500);
	  robot.mouseMove(185, 311);
	  leftClick();*/

	  robot.delay(500);
	  robot.mouseMove(761, 192);
	  leftClick();
	  inserirInsertFormula();

	  robot.mouseMove(765, 192);
	  leftClick();
	  robot.mouseMove(791, 201);
	  doubleClick();
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

  private void inserirDataFormula(String celula)
  {
  	  type("=CONCATENAR");
	  abrirParenteses();
	  type("ESQUERDA");
	  abrirParenteses();
	  type(celula + ";4");
	  fecharParenteses();
	  type(";");
	  aspaDupla();
	  type("-");
	  aspaDupla();
	  type(";EXT.TEXTO");
	  abrirParenteses();
	  type(celula + ";4;2");
	  fecharParenteses();
      type(";");
	  aspaDupla();
	  type("-");
	  aspaDupla();
	  type(";DIREITA");
	  abrirParenteses();
	  type(celula + ";2");
	  fecharParenteses();
	  fecharParenteses();
	  enter();


  }

  private void inserirInsertFormula(){
  	type("=");
  	aspaDupla();
  	type("insert into reparo");
  	abrirParenteses();
  	type("nomeproduto,linhaproduto,datareparo,datavenda,chassi,litro,voltage,estado,cidade,autorizada,item");
  	fecharParenteses();
  	robot.keyRelease(KeyEvent.VK_ESCAPE);
  	type("values");
  	abrirParenteses();

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("A1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("B1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("C1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("D1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("E1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("F1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("G1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("H1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("I1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
    type("J1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	type(",");

  	aspaSimples();
  	aspaDupla();
  	eComercial();
  	type("K1");
  	eComercial();
  	aspaDupla();
  	aspaSimples();

  	fecharParenteses();
  	type(";");

  	aspaDupla();
  	enter();
  }

  private void aspaSimples(){
    robot.keyPress(222);
    robot.keyRelease(222);
  }


  private void aspaDupla(){
  	robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(222);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private void abrirParenteses(){
  	robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_9);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private void fecharParenteses(){
  	robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_0);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private void enter(){
  	robot.keyRelease(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
  }

  private void doubleClick(){
  	robot.mousePress  (InputEvent.BUTTON1_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	robot.mousePress  (InputEvent.BUTTON1_MASK);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
  }

  private void eComercial(){
  	robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_7);
    robot.keyRelease(KeyEvent.VK_SHIFT);
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