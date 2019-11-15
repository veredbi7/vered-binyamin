import java.io.InputStreamReader;

import java.io.File;

import java.io.IOException;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;


public class q4 {
	
	
	public static void main(String[] args) throws IOException {
		String body ="";


		double width=0;
		double col = 0;
		
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String temp=in.readLine();
		
		
		col = Double.parseDouble(temp);
		in.close();
		
		width = 100/col;
		
		
		for(int i=1 ; i <=col ; i++) {
			if(i%3==1) {body+= "<div id="+"\"op1\">" + "</div>" + '\n';}
			if(i%3==2) {body+= "<div id="+"\"op2\">"+ "</div>" + '\n' ;}
			if(i%3==0) {body+= "<div id="+"\"op3\">"+ "</div>" + '\n' ;}
		}
		
		
		
		String op1 = new String("#op1 {width:" + width+"%;" + 
		                        " height: 100%;" + 
		                        "background-color: blue;" + 
		                        " float: left;  }\n") ;
		
		String op2 = new String("#op2 {width:" + width+"%;"+ 
					            " height: 100%;" + 
					            "background-color: red;" + 
					            " float: left;  }\n") ;
		
		String op3 = new String("#op3 {width:" + width+"%;"+ 
					            " height: 100%;" + 
					            "background-color: green;" + 
					            " float: left;  }\n") ;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("file.html")));
		bw.write("<html>\n" + "<head>\n" + "<style>\n" + op1 + op2 + op3 +
				"</style>\n" + "</head>\n" + "<body>\n" + body +"</body>\n" + "</html>\n");
				
		bw.close();

	}

}
