package ecr.web.app.shared.dto;



import java.io.Serializable;




public class RetournDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public Long getAvgAmount() {
		return AvgAmount;
	}
	public void setAvgAmount(Long avgAmount) {
		AvgAmount = avgAmount;
	}
	

	private Long AvgAmount;
	


	public RetournDataDTO(){}
	public RetournDataDTO(RetournDataDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		
this.AvgAmount=_Obj_defDTO.AvgAmount;


		}
	

	

}
