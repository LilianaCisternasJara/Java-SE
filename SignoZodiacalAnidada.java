import java.util.Scanner;

public class SignoZodiacalAnidada {

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int año;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese número de día en el que nació: ");
		dia = leer.nextInt();
		
		System.out.println("Ingrese número de mes de su nacimiento: ");
		mes = leer.nextInt();
		
		System.out.println("Ingrese su año de nacimiento: ");
		año = leer.nextInt();
		
		if(dia>=1 && dia <=19 && mes==1) {
			System.out.println("Capricornio");
			
		}
		else {
			if(dia>=20 && dia<=31 && mes==1) {
				System.out.println("Acuario");
			}
			else {
				if(dia>=1 && dia<=18 && mes==2) {
					System.out.println("Acuario");
				}
				else {
					if(dia>=19 && dia<=28 && mes==2) { 
						System.out.println("Piscis");
						
					}
					else {
						if(dia>=1 && dia<=20 && mes ==3) {
							System.out.println("Piscis");
						}
						else {
							if(dia>=21 && dia<=31 && mes==3) {
								System.out.println("Aries");
							}
							else { 
								if(dia>=1 && dia<=19 && mes==4) {
									System.out.println("Aries");
									}
								else {
									if(dia>=20 && dia<=30 && mes==4) {
										System.out.println("Tauro");
									}
									else {
										if(dia>=1 && dia<=21 && mes==5) {
											System.out.println("Tauro");
										}
										else {
											if(dia>=22 && dia<=31 && mes==5) {
												System.out.println("Géminis");
												}
											else {
												if(dia>=1 && dia<=20 && mes==6) {
													System.out.println("Géminis");
												}
												else{
													if(dia>=21 && dia<=30 && mes==6) {
														System.out.println("Cáncer");
													}
													else {
														if(dia>=1 && dia<=22 && mes==7) {
															System.out.println("Cáncer");
														}
														else {
															if(dia>=23 && dia<=31 && mes==7) {
																System.out.println("Leo");
															}
															else {
																if(dia>=1 && dia<=22 && mes==8) {
																	System.out.println("Leo");
																}
																else {
																	if(dia>=23 && dia<=31 && mes==8) {
																		System.out.println("Virgo");
																	}
																	else {
																		if(dia>=1 && dia<=22 && mes==9) {
																			System.out.println("Virgo");
																		}
																		else {
																			if(dia>=23 && dia<=30 && mes==9) {
																				System.out.println("Libra");
																			}
																			else {
																				if(dia>=1 && dia<=22 && mes==10) {
																					System.out.println("Libra");
																				}
																				else {
																					if(dia>=23 && dia<=31 && mes==10) {
																						System.out.println("Escorpio");
																					}
																					else {
																						if(dia>=1 && dia<=21 && mes==11) {
																							System.out.println("Escorpio");
																						}
																						else {
																							if(dia>=22 && dia<=30 && mes==11) {
																								System.out.println("Sagitario");
																							}
																							else {
																								if(dia>=1 && dia<=21 && mes==12) {
																									System.out.println("Sagitario");
																								}
																								else {
																									if(dia>=22 && dia<=31 && mes==12) {
																										System.out.println("Capricornio");
																									}
																								}
																							}
																						}
																					}
																					
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
											}
										}
									}
								}
								
							}
							
							
							
							}
							
						}
					}
				}
			}
			
			
			
		}
		
