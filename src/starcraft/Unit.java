package starcraft;

public abstract class Unit {
		protected String name; 
		protected int energy;
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public void setEnerge(int energy){
			this.energy = energy;
		}
		public int getEnerge(){
			return energy;
		}
		public abstract void decEnerge();
		@Override
		public String toString() {
		return String.format("%s: %d", name, energy);
		}
}

