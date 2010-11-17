/**
 * 
 */
package practica1;

import java.util.Vector;

import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.Connector;
import jcolibri.evaluation.Evaluator;
import jcolibri.evaluation.evaluators.LeaveOneOutEvaluator;

/**
 * @author grupo 1
 *
 */
public class EvaluadorLeaveOneOut  {

	/**
	 * 
	 */
	Connector _connector;
	CBRCaseBase _caseBase;
	public EvaluadorLeaveOneOut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

			LeaveOneOutEvaluator eval = new LeaveOneOutEvaluator();
			eval.init(new EvaluadorApp());
			eval.LeaveOneOut();
			
		
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

