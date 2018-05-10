/* Copyright (c) 2018 lib4j
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.lib4j.jci;

import java.io.IOException;
import java.net.URI;

import javax.tools.SimpleJavaFileObject;

public class JavaSourceObject extends SimpleJavaFileObject {
  private final String source;

  protected JavaSourceObject(final String className, final String source) {
    super(URI.create("source:///" + className.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
    this.source = source;
  }

  @Override
  public CharSequence getCharContent(final boolean ignoreEncodingErrors) throws IOException {
    return source;
  }
}