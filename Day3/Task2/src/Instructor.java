
public class Instructor extends User {

		private String _firstName;
		private String _lastName;
		
		public Instructor() {
			
		}

	
		public Instructor(int id, String userName, String password, String firstName, String lastName, String _firstName, String _lastName) {
			super(id, userName, password, firstName, lastName);
			this._firstName=_firstName;
			this._lastName=_lastName;
		}


		public String getFirstName() {
			return _firstName;
		}


		public void setFirstName(String firstName) {
			this._firstName = firstName;
		}


		public String getLastName() {
			return _lastName;
		}


		public void setLastName(String lastName) {
			this._lastName = lastName;
		}
		
}
