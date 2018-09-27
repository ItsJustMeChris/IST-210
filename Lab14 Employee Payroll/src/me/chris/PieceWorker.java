package me.chris;

public class PieceWorker extends Employee {
	private double wage; 
	private int pieces; 

	public PieceWorker(String first, String last, String ssn, double wagePerPiece, int piecesProduced, Date birthDate) {
		super(first, last, ssn, birthDate);
		setWage(wagePerPiece); 
		setPieces(piecesProduced); 
	} 

	public void setWage(double wagePerPiece) {
		   if (wagePerPiece < 0.0) {
		         throw new IllegalArgumentException("wagePerPiece too low, expected (wagePerPiece>=0.0)");
		   }
		   wage = wagePerPiece;
	} 

	public double getWage() {
		return wage;
	} 

	public void setPieces(int piecesProduced) {
		pieces = (piecesProduced < 0) ? 0 : piecesProduced;
	} 

	public int getPieces() {
		return pieces;
	} 

	public double earnings() {
		return getPieces() * getWage();
	} 

	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %d", "piece worker", super.toString(), "wage per piece",
				getWage(), "pieces produced", getPieces());
	}
} 
