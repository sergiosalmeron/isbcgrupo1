/**
 * 
 */
package practica4;

import java.util.Vector;

import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.Connector;
import jcolibri.evaluation.Evaluator;
import jcolibri.evaluation.evaluators.HoldOutEvaluator;

/**
 * @author grupo 1
 *
 */
public class EvaluadorHoldOut  {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	public EvaluadorHoldOut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

			HoldOutEvaluator eval = new HoldOutEvaluator();
			eval.init(new EvaluadorApp());
			eval.HoldOut(15, 1);
		
		
			Vector<Double> vec = Evaluator.getEvaluationReport().getSeries("Errores");
			double avg = 0.0;
			for (Double d: vec)
				avg+=d;
			avg=avg/(double)Evaluator.getEvaluationReport().getNumberOfCycles();
			Evaluator.getEvaluationReport().putOtherData("Media", Double.toString(avg));
			System.out.println(Evaluator.getEvaluationReport());
			jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluador buscador Noticias",false);

			
		}

	}
