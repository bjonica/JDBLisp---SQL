/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package edu.utexas.cs345.jdblisp.parser;
import edu.utexas.cs345.jdblisp.*;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 0;
            return 4;
         }
         if ((active0 & 0x7ffdfeL) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 0;
            return 16;
         }
         return -1;
      case 1:
         if ((active0 & 0x7ffffeL) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
            return 16;
         }
         return -1;
      case 2:
         if ((active0 & 0x1000L) != 0L)
            return 16;
         if ((active0 & 0x7feffeL) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
            return 16;
         }
         return -1;
      case 3:
         if ((active0 & 0x102010L) != 0L)
            return 16;
         if ((active0 & 0x6fcfeeL) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 3;
            return 16;
         }
         return -1;
      case 4:
         if ((active0 & 0x400502L) != 0L)
            return 16;
         if ((active0 & 0x2fcaecL) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
            return 16;
         }
         return -1;
      case 5:
         if ((active0 & 0x3c828L) != 0L)
            return 16;
         if ((active0 & 0x2c02c4L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 5;
            return 16;
         }
         return -1;
      case 6:
         if ((active0 & 0x2c4L) != 0L)
            return 16;
         if ((active0 & 0x2c0000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 6;
            return 16;
         }
         return -1;
      case 7:
         if ((active0 & 0x240000L) != 0L)
            return 16;
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 7;
            return 16;
         }
         return -1;
      case 8:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 8;
            return 16;
         }
         return -1;
      case 9:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 9;
            return 16;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         {
         jjmatchedKind = 26;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 39:
         return jjStopAtPos(0, 32);
      case 40:
         return jjStopAtPos(0, 29);
      case 41:
         return jjStopAtPos(0, 30);
      case 58:
         return jjStopAtPos(0, 34);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x142L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0xcL);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x210010L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2820L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x5000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4c0000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 13:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 39:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x15820L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x20040L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x102204L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0418L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80640L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x8100L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x8L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x16000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x4L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 16);
         return jjMoveStringLiteralDfa3_0(active0, 0x200002L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x208028L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 16);
         return jjMoveStringLiteralDfa4_0(active0, 0x34002L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 107:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 16);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000c0L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x4L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0xc0400L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 112:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(3, 4, 16);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 98:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x44000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x4L);
      case 107:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 114:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(4, 1, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 16);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x18008L);
      case 121:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2c0000L);
      case 101:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(5, 3, 16);
         else if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 16);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 16);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 16);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 16);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x280L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x4L);
      case 116:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 16);
         break;
      case 122:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 16);
         break;
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(6, 7, 16);
         break;
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000L);
      case 116:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(6, 2, 16);
         else if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 16);
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 18, 16);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(7, 21, 16);
         break;
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(10, 19, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 16;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddTwoStates(8, 9);
                  }
                  else if ((0x7000ac0000000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(12, 13);
                  else if (curChar == 44)
                  {
                     if (kind > 35)
                        kind = 35;
                  }
                  else if (curChar == 59)
                     jjCheckNAddTwoStates(1, 2);
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 4:
                  if ((0xf3ffac0000000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(15);
                  }
                  if ((0x7000ac0000000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  break;
               case 16:
                  if ((0xf3ffac0000000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(15);
                  }
                  if ((0x7000ac0000000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 28)
                     kind = 28;
                  break;
               case 6:
                  if (curChar == 44 && kind > 35)
                     kind = 35;
                  break;
               case 7:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 46)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 12:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 13:
                  if (curChar == 34 && kind > 37)
                     kind = 37;
                  break;
               case 14:
                  if ((0x7000ac0000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAddTwoStates(14, 15);
                  break;
               case 15:
                  if ((0xf3ffac0000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(15);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(15);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 16:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(15);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  break;
               case 1:
                  jjAddStates(0, 1);
                  break;
               case 3:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if ((0x100000001000L & l) != 0L && kind > 31)
                     kind = 31;
                  break;
               case 12:
                  jjAddStates(2, 3);
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAddTwoStates(14, 15);
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(15);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 16 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 12, 13, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\141\154\164\145\162", "\143\157\155\155\145\156\164", 
"\143\162\145\141\164\145", "\144\162\157\160", "\162\145\156\141\155\145", 
"\141\156\141\154\171\172\145", "\145\170\160\154\141\151\156", "\141\165\144\151\164", 
"\156\157\141\165\144\151\164", "\147\162\141\156\164", "\162\145\166\157\153\145", "\163\145\164", 
"\162\157\154\145", "\163\145\154\145\143\164", "\165\160\144\141\164\145", 
"\144\145\154\145\164\145", "\151\156\163\145\162\164", "\164\162\165\156\143\141\164\145", 
"\164\162\141\156\163\141\143\164\151\157\156", "\154\157\143\153", "\144\141\164\141\142\141\163\145", 
"\164\141\142\154\145", null, null, null, null, null, null, "\50", "\51", null, "\47", "\43\47", 
"\72", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fe07fffffL, 
};
static final long[] jjtoSkip = {
   0x1f800000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[16];
static private final int[] jjstateSet = new int[32];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 16; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 35;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 1 :
         break;
      case 2 :
         break;
      case 3 :
         break;
      case 4 :
         break;
      case 5 :
         break;
      case 6 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         break;
      case 33 :
         break;
      case 34 :
         break;
      case 35 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 36 :
         break;
      case 37 :
         break;
      case 38 :
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
