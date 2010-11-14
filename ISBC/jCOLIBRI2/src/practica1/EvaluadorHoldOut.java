/**
 * 
 */
package practica1;

import java.util.*;

import javax.swing.JOptionPane;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.evaluation.Evaluator;
import jcolibri.evaluation.evaluators.HoldOutEvaluator;
import jcolibri.exception.ExecutionException;
import jcolibri.extensions.recommendation.casesDisplay.DisplayCasesTableMethod;
import jcolibri.extensions.recommendation.navigationByAsking.ObtainQueryWithAttributeQuestionMethod;
import jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.test.test16.EmailSolution;
import jcolibri.test.test6.Test6;
import jcolibri.test.test8.EvaluableApp;
import jcolibri.test.test8.TravelDescription;

/**
 * @author anicetobacter
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
			jcolibri.evaluation.tools.EvaluationResultGUI.show(Evaluator.getEvaluationReport(), "Evaluacion Quinielas",false);

			
		}

	}





