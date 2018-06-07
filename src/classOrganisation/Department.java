package classOrganisation;

public class Department {
	 private Staff s ;
	    Department() {}
	    Department(String name, Staff s) {
	        this.s = s ;
}
		public Staff getS() {
			return s;
		}
		public void setS(Staff s) {
			this.s = s;
		}
}