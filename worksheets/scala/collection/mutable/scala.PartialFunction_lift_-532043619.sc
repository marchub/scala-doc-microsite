//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#lift:A=>Option[B]">scala.PartialFunction#lift</a></li>
//<li name="scala.PartialFunction#lift" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="lift:A=>Option[B]"></a><a id="lift:(Int)⇒Option[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#lift:A=>Option[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">lift</span><span class="result">: (<a href="../../Int.html" class="extype" name="scala.Int">Int</a>) ⇒ <a href="../../Option.html" class="extype" name="scala.Option">Option</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> <p class="shortcomment cmt">Turns this partial function into a plain function returning an <code>Option</code> result.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Turns this partial function into a plain function returning an <code>Option</code> result.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a function that takes an argument <code>x</code> to <code>Some(this(x))</code> if <code>this</code> is defined for <code>x</code>, and to <code>None</code> otherwise.</p>
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
//    See also
//   </dt>
//   <dd>
//    <span class="cmt"><p>Function.unlift</p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
