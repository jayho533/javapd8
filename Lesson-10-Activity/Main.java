
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
   

  }
  String gradepointavg( double grade1, double grade2, double grade3){
	double gpa = grade1+grade2+grade3 /3;
	if(gpa>=90){
		return gpa * 1.1;
		else
		return gpa;
	}
  }
  
   boolean isgraduating(double credits, int gradelevel){
	if(gradelevel >=12 && credits >=44){
		return true;
		else
		return false;
	}
   }
  
}