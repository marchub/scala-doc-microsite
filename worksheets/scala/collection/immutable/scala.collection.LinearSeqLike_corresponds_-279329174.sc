//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#corresponds[B](that:scala.collection.GenSeq[B])(p:(A,B)=>Boolean):Boolean">scala.collection.LinearSeqLike#corresponds</a></li>
//<li name="scala.collection.LinearSeqLike#corresponds" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="corresponds[B](that:scala.collection.GenSeq[B])(p:(A,B)=>Boolean):Boolean"></a><a id="corresponds[B](GenSeq[B])((A,B)⇒Boolean):Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#corresponds[B](that:scala.collection.GenSeq[B])(p:(A,B)=>Boolean):Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">corresponds</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.LinearSeqLike.corresponds.B">B</span>]</span>)</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.immutable.List.A">A</span>, <span class="extype" name="scala.collection.LinearSeqLike.corresponds.B">B</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>)</span><span class="result">: <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Tests whether every element of this sequence relates to the corresponding element of another sequence by satisfying a test predicate.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Tests whether every element of this sequence relates to the corresponding element of another sequence by satisfying a test predicate. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the type of the elements of <code>that</code></p>
//   </dd>
//   <dt class="param">
//    that
//   </dt>
//   <dd class="cmt">
//    <p>the other sequence</p>
//   </dd>
//   <dt class="param">
//    p
//   </dt>
//   <dd class="cmt">
//    <p>the test predicate, which relates elements from both sequences</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p><code>true</code> if both sequences have the same length and <code>p(x, y)</code> is <code>true</code> for all corresponding elements <code>x</code> of this sequence and <code>y</code> of <code>that</code>, otherwise <code>false</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../LinearSeqLike.html" class="extype" name="scala.collection.LinearSeqLike">LinearSeqLike</a> → 
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
//    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a>
//   </dd>
//   <dt>
//    Annotations
//   </dt>
//   <dd> 
//    <span class="name">@<a href="../../annotation/tailrec.html" class="extype" name="scala.annotation.tailrec">tailrec</a></span>
//    <span class="args">()</span> 
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
