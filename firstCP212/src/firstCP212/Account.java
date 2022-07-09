package firstCP212;

 class Account {
		private String ownerName;
		private double balance;
		public String getCurrentBalance;
		public Account () {
			ownerName = "Unassigned";
			balance = 0.0;
			
		}
		public void add(double amt) {
			balance = balance + amt;
		}
		public void deduct(double amt) {
			balance = balance - amt;
		}
		public double getCurrentBalance() {
			return balance;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setInitialBalance(double bal) {
			balance = bal;
		}
		public void setOwnerName(String name) {
			ownerName = name;
		}
	}



