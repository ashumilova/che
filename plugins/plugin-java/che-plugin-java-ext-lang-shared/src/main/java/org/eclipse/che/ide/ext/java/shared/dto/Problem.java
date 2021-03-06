/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.ext.java.shared.dto;


import org.eclipse.che.dto.shared.DTO;

import java.util.List;

/**
 * DTO for {@link org.eclipse.jdt.core.compiler.IProblem}
 * Description of a Java problem, as detected by the compiler or some of the underlying
 * technology reusing the compiler.
 *
 * @author Evgen Vidolob
 */
@DTO
public interface Problem {
    /**
     * Answer the file name in which the problem was found.
     *
     * @return the file name in which the problem was found
     */
    String getOriginatingFileName();

    void setOriginatingFileName(String originatingFileName);

    /**
     * Answer a localized, human-readable message string which describes the problem.
     *
     * @return a localized, human-readable message string which describes the problem
     */
    String getMessage();

    void setMessage(String message);

    /**
     * Returns the problem id
     *
     * @return the problem id
     */
    int getID();

    void setID(int ID);

    /**
     * Answer back the original arguments recorded into the problem.
     *
     * @return the original arguments recorded into the problem
     */
    List<String> getArguments();

    void setArguments(List<String> arguments);

    /**
     * Answer the start position of the problem (inclusive), or -1 if unknown.
     *
     * @return the start position of the problem (inclusive), or -1 if unknown
     */
    int getSourceStart();

    void setSourceStart(int start);

    /**
     * Answer the end position of the problem (inclusive), or -1 if unknown.
     *
     * @return the end position of the problem (inclusive), or -1 if unknown
     */
    int getSourceEnd();

    void setSourceEnd(int end);

    /**
     * Answer the line number in source where the problem begins.
     *
     * @return the line number in source where the problem begins
     */
    int getSourceLineNumber();

    void setSourceLineNumber(int lineNumber);

    /**
     * Checks the severity to see if the Error bit is set.
     *
     * @return true if the Error bit is set for the severity, false otherwise
     */
    boolean isError();

    void setError(boolean isError);

    /**
     * Checks the severity to see if the Error bit is not set.
     *
     * @return true if the Error bit is not set for the severity, false otherwise
     */
    boolean isWarning();

    void setWarning(boolean isWarning);
}
