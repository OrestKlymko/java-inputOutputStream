package checkNumber;

public class CheckLine {

	public void checkerLine(String line){

		int index=0;
		int l=0;
		int k=0;
		for (char ch : line.toCharArray()) {
			if(Character.isLetter(ch)) {
				return;
			}
			if((ch=='('&index==0)
					||(ch==')'&index==4)
					||(ch==' '&&index==5)
					||(ch=='-'&index==9)){
				k++;
			}

			if(ch=='-'&(index==3||index==7)){
				l++;
			}

			index++;
			if(ch=='\n'){
				index=0;
			}
		}
		if(l==2||k==4)
			System.out.println(line);
	}

}
