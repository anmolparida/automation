package FrameworkDesign;

import java.util.ArrayList;
import java.util.HashMap;


public class Execution {


	public static void main (String[] args) throws Exception{

		//InstructionLibrary.OpenBrowser("chrome", "http://newtours.demoaut.com/");
		//InstructionLibrary.EnterText("name", "username", "batman");
		//InstructionLibrary.EnterText("name", "password", "batman");


		//InstructionLibrary.controller("OpenBrowser", "chrome", "http://newtours.demoaut.com/");
		//InstructionLibrary.controller("EnterText", "//input[@name='userName']", "batman");
		//InstructionLibrary.controller("EnterText", "//input[@name='password']", "batman");
		//InstructionLibrary.controller("ClickButton", "//input[@name='login']", "null");

		ExcelCommunication obj = new ExcelCommunication();
		ArrayList<String> indexList = obj.readIndex();
		
		for(int j = 0; j < indexList.size(); j++){
			HashMap<Integer, ArrayList<String>> tempmap = obj.readExcel();

			for(int i = 0; i < tempmap.size(); i++){

				ArrayList<String> templist = tempmap.get(i);

				MethodLibrary.controller(templist.get(0).trim(), templist.get(1).trim(), templist.get(2).trim(), templist.get(3).trim(), templist.get(4).trim());

				obj.writeExcel(i, MethodLibrary.result, indexList.get(j));
			}
		}

	}
}

