/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hmod.domains.sc;

import hmod.core.DataHandler;

/**
 *
 * @author Jano-ThinkPad
 */
public interface SolutionBuildHandler extends DataHandler{
    boolean isComplete();
    boolean itemCoveringUniverse();
    boolean itemNoCoveringUniverse();
    boolean itemSelectionCovering();
}

