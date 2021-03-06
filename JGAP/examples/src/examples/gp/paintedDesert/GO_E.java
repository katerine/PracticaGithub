/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */
package examples.gp.paintedDesert;

import org.jgap.*;
import org.jgap.gp.*;
import org.jgap.gp.impl.*;

/**
 * Moves the ant to the right.
 *
 * @author Scott Mueller
 * @since 3.2
 */
public class GO_E
    extends AntCommand implements IMutateable {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.2 $";

  /**
   * Constructor for the Go east function
   * @param a_conf
   * @throws InvalidConfigurationException
   */
  public GO_E(final GPConfiguration a_conf)
      throws InvalidConfigurationException {
    super(a_conf, 0, CommandGene.VoidClass);
  }

  /**
   * Mutates the gene.
   */
  public CommandGene applyMutation(int index, double a_percentage)
      throws InvalidConfigurationException {
    GO_W mutant = new GO_W(getGPConfiguration());
    return mutant;
  }

  /**
   * Goes east if possible
   */
  public void execute_void(ProgramChromosome a_chrom, int a_n, Object[] a_args) {
    AntMap map = getMap(a_chrom);
    map.getAnt().goE(map);
  }

  /**
   * Returns the program listing name
   */
  public String toString() {
    return "GO-E";
  }
}
