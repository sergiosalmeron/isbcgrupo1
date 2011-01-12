package practica42;
import java.util.Vector;

import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.Connector;
import jcolibri.evaluation.Evaluator;
import jcolibri.evaluation.evaluators.NFoldEvaluator;

/**
 * @author grupo 1
 *
 */
public class EvaluadorNFold  {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	public EvaluadorNFold() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


			NFoldEvaluator eval = new NFoldEvaluator();
			eval.init(new EvaluadorApp());
			eval.NFoldEvaluation(10, 1);
			
		
			Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
			double avg = 0.0;
			for (Double d: vec)
				avg+=d;
			avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
			Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
			System.out.println(Evaluator.getEvaluationReport());
			jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluacion Quinielas",false);

			
		}

	}
