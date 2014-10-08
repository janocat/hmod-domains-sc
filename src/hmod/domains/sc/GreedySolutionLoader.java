/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hmod.domains.sc;

import flexbuilders.core.NestedBuilder;
import flexbuilders.graph.BuilderGraph;
import hmod.core.Step;
import hmod.loader.graph.AlgorithmBuilders;

/**
 *
 * @author Jano-ThinkPad
 */
public class GreedySolutionLoader {
    public static NestedBuilder<Step> load(BuilderGraph graph)
    {
        SetCoveringOperatorFactory scOps = SetCoveringOperatorFactory.getInstance();
        NestedBuilder solutionData = graph.node(SetCoveringIds.SOLUTION_DATA);
        
        return AlgorithmBuilders.
                algorithmBlock().
                    While(scOps::checkSolutionIsComplete, solutionData).
                        call(graph.node(SetCoveringIds.SEARCH_ITEM_START)).
                        call(graph.node(SetCoveringIds.SELECTION_ITEM)).
                    end().
                    call(graph.node(SetCoveringIds.PRINT_SOLUTION_START));
    }
}
