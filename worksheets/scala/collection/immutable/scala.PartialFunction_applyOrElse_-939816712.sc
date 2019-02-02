//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1">scala.PartialFunction#applyOrElse</a></li>
//<li name="scala.PartialFunction#applyOrElse" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1"></a><a id="applyOrElse[A1<:Int,B1>:A](A1,(A1)⇒B1):B1"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">applyOrElse</span><span class="tparams">[<span name="A1">A1 &lt;: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="B1">B1 &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="x">x: <span class="extype" name="scala.PartialFunction.applyOrElse.A1">A1</span></span>, <span name="default">default: (<span class="extype" name="scala.PartialFunction.applyOrElse.A1">A1</span>) ⇒ <span class="extype" name="scala.PartialFunction.applyOrElse.B1">B1</span></span>)</span><span class="result">: <span class="extype" name="scala.PartialFunction.applyOrElse.B1">B1</span></span> </span> <p class="shortcomment cmt">Applies this partial function to the given argument when it is contained in the function domain.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Applies this partial function to the given argument when it is contained in the function domain. Applies fallback function where this partial function is not defined.</p>
//   <p> Note that expression <code>pf.applyOrElse(x, default)</code> is equivalent to</p>
//   <pre><span class="kw">if</span>(pf isDefinedAt x) pf(x) <span class="kw">else</span> default(x)</pre>
//   <p> except that <code>applyOrElse</code> method can be implemented more efficiently. For all partial function literals the compiler generates an <code>applyOrElse</code> implementation which avoids double evaluation of pattern matchers and guards. This makes <code>applyOrElse</code> the basis for the efficient implementation for many operations and scenarios, such as:</p>
//   <ul>
//    <li>combining partial functions into <code>orElse</code>/<code>andThen</code> chains does not lead to excessive <code>apply</code>/<code>isDefinedAt</code> evaluation</li>
//    <li><code>lift</code> and <code>unlift</code> do not evaluate source functions twice on each invocation</li>
//    <li><code>runWith</code> allows efficient imperative-style combining of partial functions with conditionally applied actions</li>
//   </ul>
//   <p> For non-literal partial function classes with nontrivial <code>isDefinedAt</code> method it is recommended to override <code>applyOrElse</code> with custom implementation that avoids double <code>isDefinedAt</code> evaluation. This may result in better performance and more predictable behavior w.r.t. side effects. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    x
//   </dt>
//   <dd class="cmt">
//    <p>the function argument</p>
//   </dd>
//   <dt class="param">
//    default
//   </dt>
//   <dd class="cmt">
//    <p>the fallback function</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the result of this function or fallback function application.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>
//   </dd>
//   <dt>
//    Since
//   </dt>
//   <dd>
//    <p>2.10</p>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---


























