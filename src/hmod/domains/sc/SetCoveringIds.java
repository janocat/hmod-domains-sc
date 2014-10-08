/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hmod.domains.sc;

import flexbuilders.graph.GraphFactory;
import flexbuilders.graph.NodeId;
import hmod.core.Step;

/**
 *
 * @author Jano-ThinkPad
 */
public class SetCoveringIds {
    public static final NodeId<SolutionBuildHandler> SOLUTION_DATA = GraphFactory.nodeId(
        "SetCoveringIds.SOLUTION_DATA"
    );
    
    public static final NodeId<Step> SEARCH_ITEM_START = GraphFactory.nodeId(
        "SetCoveringIds.SEARCH_ITEM_START"
    );   
    
    public static final NodeId<Step> SELECTION_ITEM = GraphFactory.nodeId(
        "SetCoveringIds.SELECTION_ITEM"
    );
    
    public static final NodeId<Step> PRINT_SOLUTION_START = GraphFactory.nodeId(
        "SetCoveringIds.PRINT_SOLUTION_START"
    );
}