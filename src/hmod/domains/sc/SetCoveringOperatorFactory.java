/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hmod.domains.sc;

import hmod.core.Condition;
import hmod.loader.graph.ArgumentList;

/**
 *
 * @author Jano-ThinkPad
 */
public final class SetCoveringOperatorFactory {
    
    private static SetCoveringOperatorFactory instance;
    
    public static SetCoveringOperatorFactory getInstance() {
        if(instance == null)
            instance = new SetCoveringOperatorFactory();
        
        return instance;
    }
    
    private SetCoveringOperatorFactory()
    {
    }
    
    public Condition checkSolutionIsComplete(ArgumentList args)
    {
        SolutionBuildHandler solutionHandler = args.next(SolutionBuildHandler.class);
        
        return () -> {
            return solutionHandler.isComplete(); 
        };
    }
    
    public Condition checkCovering(ArgumentList args)
    {
        SolutionBuildHandler solutionHandler = args.next(SolutionBuildHandler.class);
        
        return () -> {
          return solutionHandler.itemCoveringUniverse();
        };
    }
    
    public Condition noCheckCovering (ArgumentList args)
    {
        SolutionBuildHandler solutionBuildHandler = args.next(SolutionBuildHandler.class);
        
        return () -> {
            return solutionBuildHandler.itemNoCoveringUniverse();
        };
        //falta programar el pseudocodigo de la funcion seleccionar item
    }
    
    public Condition selectionCovering (ArgumentList args)
    {
        SolutionBuildHandler solutionBuildHandler = args.next(SolutionBuildHandler.class);
        
        return () -> {
          return solutionBuildHandler.itemSelectionCovering();
        };
    }
}