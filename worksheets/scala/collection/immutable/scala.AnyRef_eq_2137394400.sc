//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#eq(x$1:AnyRef):Boolean">scala.AnyRef#eq</a></li>
//<li name="scala.AnyRef#eq" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="eq(x$1:AnyRef):Boolean"></a><a id="eq(AnyRef):Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#eq(x$1:AnyRef):Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">eq</span><span class="params">(<span name="arg0">arg0: <a href="../../AnyRef.html" class="extype" name="scala.AnyRef">AnyRef</a></span>)</span><span class="result">: <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Tests whether the argument (<code>that</code>) is a reference to the receiver object (<code>this</code>).</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Tests whether the argument (<code>that</code>) is a reference to the receiver object (<code>this</code>).</p>
//   <p> The <code>eq</code> method implements an <a href="http://en.wikipedia.org/wiki/Equivalence_relation" target="_blank">equivalence relation</a> on non-null instances of <code>AnyRef</code>, and has three additional properties:</p>
//   <ul>
//    <li>It is consistent: for any non-null instances <code>x</code> and <code>y</code> of type <code>AnyRef</code>, multiple invocations of <code>x.eq(y)</code> consistently returns <code>true</code> or consistently returns <code>false</code>.</li>
//    <li>For any non-null instance <code>x</code> of type <code>AnyRef</code>, <code>x.eq(null)</code> and <code>null.eq(x)</code> returns <code>false</code>.</li>
//    <li><code>null.eq(null)</code> returns <code>true</code>.</li>
//   </ul>
//   <p> When overriding the <code>equals</code> or <code>hashCode</code> methods, it is important to ensure that their behavior is consistent with reference equality. Therefore, if two objects are references to each other (<code>o1 eq o2</code>), they should be equal to each other (<code>o1 == o2</code>) and they should hash to the same value (<code>o1.hashCode == o2.hashCode</code>). </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p><code>true</code> if the argument is a reference to the receiver object; <code>false</code> otherwise.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    AnyRef
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
