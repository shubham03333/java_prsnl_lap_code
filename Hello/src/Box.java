
class Box {

	double width,depth,height,side;
	
	Box(double width,double depth, double h){
		this.width=width;
		this.depth=depth;
		height=h;
	}
	
	Box(double side){
		
		this.side=side;
	}
	String getDimensions() {
		return "Box Dime "+width+depth+height;
	}
	
	double getAreaOfCube() {
		return side*side*side;
	}
	double getVolumeOfBox() {
		return width*depth*height;
	}
	
	boolean checkEquality(Box anotherBox) {
		return this.width==anotherBox.width && this.depth==anotherBox.depth && this.height==anotherBox.height;
	}
}
