package Lamda_Expressions;

public class MethodReferenceExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 person = new Person4();			//(a,b) ->a.compareTolgnoreCase(b)
		person.ordering( String :: compareToIgnoreCase );
	}

}
