package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;


public class IncorrectNumberOfIteratorsError extends TypeCheckingError {

	/**
	 * The error class raised when trying to access an iterator with an invalid number of iterators.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param iterator : the iterator.
	 * @param numberOfIterators : the invalid number of iterators.
	 */
	public IncorrectNumberOfIteratorsError(EObject cause, OclIterator iterator, int numberOfIterators) {
		this.cause = cause;
		if (iterator.getMinIteratorAmount() > numberOfIterators)
			this.message = "Too few iterators for '" + iterator.getName() + "' (expected ≥" + iterator.getMinIteratorAmount() + ", got " + numberOfIterators + ").";
		else
			this.message = "Too many iterators for '" + iterator.getName() + "' (expected ≤" + iterator.getMinIteratorAmount() + ", got " + numberOfIterators + ").";
	}
	
}
