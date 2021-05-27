package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

//max 35 studenti
//nr grupei cuprins intre 1000 si 1100

public class Grupa {
	 private List<IStudent> studenti;
	    private int nrGrupa;

	    public Grupa(int nrGrupa){
	    	if(nrGrupa<1000 || nrGrupa>1100) {
	    		throw new IndexOutOfBoundsException();
	    	} else {
		        this.nrGrupa=nrGrupa;
		        studenti=new ArrayList<>();
	    	}

	    }

	    public void importaStudenti(List<IStudent> studenti){
	        this.studenti.addAll(studenti);
	    }

	    public void adaugaStudent(IStudent student){
	        studenti.add(student);
	    }

	    public List<IStudent> getStudenti() {
			return studenti;
		}

		public void setStudenti(List<IStudent> studenti) {
			this.studenti = studenti;
		}

		public int getNrGrupa() {
			return nrGrupa;
		}

		public void setNrGrupa(int nrGrupa) {
			this.nrGrupa = nrGrupa;
		}

		public IStudent getStudent(int index){
	        if(index>=0 && index< studenti.size()){
	            return studenti.get(index);
	        }
	        throw new IndexOutOfBoundsException();
	    }

	    public float getPromovabilitate(){
	    	if(this.studenti.size() == 0) {
	    		return 0;
	    	}
	    	
	        float nrIntegralisti=0;
	        for(IStudent student:studenti){
	            if(!student.areRestante()){
	                nrIntegralisti++;
	            }
	        }
	        return nrIntegralisti/studenti.size();
	    }
}
